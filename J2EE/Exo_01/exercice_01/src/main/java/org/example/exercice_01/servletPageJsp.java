package org.example.exercice_01;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name="servletPageJsp", value="/page-jsp")
public class servletPageJsp extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("page JSP");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        getServletContext().getRequestDispatcher("/pageJsp.jsp").forward(req, resp);
    }
}
