package org.example.exercice_01.model;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    List<TodoModel> todos;

    public TodoService(List<TodoModel> todos) {
        this.todos = todos;
    }
}
