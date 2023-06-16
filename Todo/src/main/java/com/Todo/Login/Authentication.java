package com.Todo.Login;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Controller
@Service
@SessionAttributes("name")
public class Authentication {

    class pair{
        String F, S;
        public pair(String F, String S) {
            this.F = F;
            this.S = S;
        }
    }

    List<pair> users = new ArrayList();
    public boolean AddToUsers(String username,String password){
        pair credential = new pair(username,password);
        if(users.stream().anyMatch(p -> p.F.equals(username) && p.S.equals(password))){
            return true;
        }
        else{
            users.add(credential);
            return false;
        }
    }

    @RequestMapping("welcome")
    public String GoWelcomeBack(){
        return "Welcome.jsp";
    }
    public Boolean authenticate(String username , String password){
        boolean containsPair = users.stream().anyMatch(p -> p.F.equals(username) && p.S.equals(password));
        return containsPair;
    }
}
