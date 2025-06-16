package org.example.exercice_01.controller;

import org.example.exercice_01.model.TodoModel;
import org.example.exercice_01.model.TodoService;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TodoController {
    public TodoModel todo1 =new TodoModel("test1", "test2", false);
    public TodoModel todo2= new TodoModel("test1", "test2", false);
    public List<TodoModel> getTodo(){
        return List.of(todo1, todo2);
    }



    @RequestMapping("/todo")
    public String firstTodo(Model model){
        model.addAttribute("name","first todo");
        model.addAttribute("description","finir l'exercice");
        model.addAttribute("isDone",false);
        return "todo";
    }

    @RequestMapping("/alltodos")
    public String allTodos(Model model){

        model.addAttribute("todos", getTodo());
        return "listOfTodos";
    }


}
