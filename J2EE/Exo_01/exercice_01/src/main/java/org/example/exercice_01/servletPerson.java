package org.example.exercice_01;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.exercice_01.entity.Personne;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name="exo3", value ="/person" )
public class servletPerson extends HttpServlet {

    List<Personne> personnes = new ArrayList<Personne>();

    @Override
    public void init() throws ServletException {
        personnes.add(Personne.builder().age(20).name("Max").firstname("PasMax").build());
        personnes.add(Personne.builder().age(12).name("Paul").firstname("AZbdz").build());
        personnes.add(Personne.builder().age(80).name("Peter").firstname("azdz").build());
        personnes.add(Personne.builder().age(36).name("Toto").firstname("kjhbtr").build());

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("personnes", personnes);
        req.getRequestDispatcher("/person.jsp").forward(req, resp);
    }

}
