package com.Todo.todoData;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class TodoData {

    private int id;
    private String username;
    private String description;
    private LocalDate targetDate;
    private boolean done;

}
