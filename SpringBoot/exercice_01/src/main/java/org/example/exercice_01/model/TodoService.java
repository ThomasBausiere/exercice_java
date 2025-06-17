package org.example.exercice_01.model;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    List<TodoModel> todos;

    public TodoService(List<TodoModel> todos) {
        this.todos = todos;
    }

    public TodoModel getTodo(int id) {
        TodoModel todoToGet;
        for (TodoModel todos : todos) {
            if (todos.getId(id) == id) {
                todoToGet = todos;
                return todoToGet;
            }
        }
        return null;
    }
}
