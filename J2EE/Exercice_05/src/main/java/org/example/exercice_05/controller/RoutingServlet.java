package org.example.exercice_05.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import org.example.exercice_05.dao.DogDao;
import org.example.exercice_05.model.Dog;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "routing", value = "/dog/*")
public class RoutingServlet extends HttpServlet {

    private final DogDao dogDao = new DogDao();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pathInfo = req.getPathInfo();
        System.out.println("Path received: " + pathInfo);

        switch (pathInfo) {
            case "/add":
                req.getRequestDispatcher("/WEB-INF/view/addDogView.jsp").forward(req, resp);
                break;

            case "/detail":
                String idParam = req.getParameter("id");
                if (idParam != null) {
                    try {
                        int id = Integer.parseInt(idParam);
                        Dog dog = dogDao.get(id);
                        if (dog != null) {
                            req.setAttribute("dog", dog);
                            req.getRequestDispatcher("/WEB-INF/view/detailDogView.jsp").forward(req, resp);
                        } else {
                            resp.sendError(HttpServletResponse.SC_NOT_FOUND, "Chien non trouvé pour l'id : " + id);
                        }
                    } catch (NumberFormatException e) {
                        resp.sendError(HttpServletResponse.SC_BAD_REQUEST, "ID invalide");
                    }
                } else {
                    resp.sendError(HttpServletResponse.SC_BAD_REQUEST, "Paramètre 'id' manquant");
                }
                break;


            case "/show-all":
                List<Dog> dogs = dogDao.get(); // 🔥 Chargement depuis la base
                req.setAttribute("dogs", dogs);
                req.getRequestDispatcher("/WEB-INF/view/allDogView.jsp").forward(req, resp);
                break;

            default:
                resp.sendError(HttpServletResponse.SC_NOT_FOUND);
                break;
        }
    }
}
