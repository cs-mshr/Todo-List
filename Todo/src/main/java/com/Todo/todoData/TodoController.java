package com.Todo.todoData;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@SessionAttributes("name")
@AllArgsConstructor
@Controller
public class TodoController {
    private TodoService todoService;

    @RequestMapping("list-todos")
    public String AllTodos(ModelMap model){
        model.addAttribute("todos",todoService.ListElements());
        return "listTodos.jsp";
    }
}
