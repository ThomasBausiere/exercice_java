package org.example.exercice_01;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="servletTextHtml", value="/text-html")
public class servletTextHtml extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("page text/html");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter writer =resp.getWriter();

        writer.println("<html><body>");
        writer.println("<h1> Hello There</h1>");
        writer.println("<h2> Général Kenobi</h2>");
        writer.println("<p> oui, c'est une réplique culte.");
        writer.println("</body></<html>");
    }
}
