package org.example.exercice_05.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import org.example.exercice_05.controller.dao.DogDao;
import org.example.exercice_05.model.Dog;

import java.io.IOException;
import java.time.LocalDate;

@WebServlet(name = "addDog", value = "/dog/form")
public class AddDogServlet extends HttpServlet {

    private final DogDao dogDao = new DogDao();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String dogName = req.getParameter("dogname");
        String raceName = req.getParameter("racename");
        String birthDateStr = req.getParameter("birthdate");

        try {
            LocalDate birthDate = LocalDate.parse(birthDateStr);

            Dog dog = Dog.builder()
                    .dogName(dogName)
                    .raceName(raceName)
                    .birthDate(birthDate)
                    .build();

            dogDao.save(dog);

            // Redirection vers la liste après ajout
            resp.sendRedirect(req.getContextPath() + "/dog/show-all");
        } catch (Exception e) {
            e.printStackTrace();
            // Redirection vers formulaire en cas d'erreur
            resp.sendRedirect(req.getContextPath() + "/dog/add?error=true");
        }
    }
}
