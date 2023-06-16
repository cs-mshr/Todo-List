package com.Todo.Login;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@AllArgsConstructor
@Controller
@SessionAttributes("name")
public class LoginController {
    private Authentication auth;

    @RequestMapping("/")
    public String Front(){
        auth.AddToUsers("admin","admin");
        return "front.jsp";
    }

    @RequestMapping(value = "login")
    public String loginJsp(){
        return "login.jsp";
    }

    @RequestMapping("create-account")
    public String AccountCreation(){
        return "CreateAcc.jsp";
    }

    @PostMapping(value = "create-account")
    public String createpage(@RequestParam String name ,
                             @RequestParam String password ,
                             ModelMap model){

        if(auth.AddToUsers(name,password)){
            model.put("errorMessage","Account already Exist !!!");
        }else{
            model.put("SuccesMessage","Account Created Goto Login");
        }

        return "CreateAcc.jsp";
    }


    @PostMapping(value = "login")
    public String WelcomeJsp(@RequestParam String name,
                             @RequestParam String password,
                             ModelMap model){

        //Authentication
        if(auth.authenticate(name,password)){
            model.put("name",name);
            return "Welcome.jsp";
        }
        else{
            model.put("errorMessage","Invaild userName or Password");
            return "login.jsp";
        }
    }

}
