package org.example.exo4.controller;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.exo4.model.Cat;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/form")
public class FormCatServlet extends HttpServlet {

    List<Cat> cats = new ArrayList<>();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("cats", cats);
        req.getRequestDispatcher("/WEB-INF/view/catView.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


            String catName= req.getParameter("catname");
            String raceName= req.getParameter("racename");
            String favoriteFood =req.getParameter("favoritefood");
            LocalDate birthDate =LocalDate.parse(req.getParameter("birthdate"));
        cats.add(Cat.builder().catName(catName).raceName(raceName).favoriteFood(favoriteFood).birthDate(birthDate).build());
        doGet(req, resp);

        System.out.println("Nouveau chat:");
        System.out.println("nom:" +catName);
        System.out.println("race" +raceName);
        System.out.println("Food "+favoriteFood);

    }
}
