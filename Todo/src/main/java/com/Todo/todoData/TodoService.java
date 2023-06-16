package com.Todo.todoData;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//@AllArgsConstructor
@Service
public class TodoService {
    private static List<TodoData> todos = new ArrayList<>();
    static{
        todos.add(new TodoData(
                1,"UkgDivision" , "Must be 3 Years", LocalDate.now().plusYears(3),false
        ));
        todos.add(new TodoData(
                2,"LkgDivision" , "Must be 4 Years", LocalDate.now().plusYears(4),false
        ));
        todos.add(new TodoData(
                3,"PrimaryWing" , "Must be 5 Years", LocalDate.now().plusYears(5),false
        ));
        todos.add(new TodoData(
                4,"SecondaryStudent" , "Must be 10 Years", LocalDate.now().plusYears(10),false
        ));
    }

    public List<TodoData> ListElements(){
        return todos;
    }

}
