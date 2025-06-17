package org.example.exercice_01.controller;

import org.example.exercice_01.model.TodoModel;
import org.example.exercice_01.model.TodoService;
import org.springframework.boot.Banner;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TodoController {
    public TodoModel todo1 =new TodoModel(1 , "test1", "description 1", false);
    public TodoModel todo2= new TodoModel(2, "test2", "description 2", false);

    private TodoService todoService;



    @RequestMapping("/todo")
    public String getTodo(Model model){

           TodoModel todoTest = todoService.getTodo(1);
        model.addAttribute("name", todoTest);
        model.addAttribute("description", "test1");
        return "todo";
    }

    @RequestMapping("/alltodos")
    public String allTodos(Model model){


        return "listOfTodos";
    }


}
