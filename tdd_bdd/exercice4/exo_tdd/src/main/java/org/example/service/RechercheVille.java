package org.example.service;

import org.example.exception.NotFoundException;

import java.util.List;

public class RechercheVille{
    private List<String> villes;


    public List<String> rechercher(String mot) throws NotFoundException  {
       return  villes;
    }

    public RechercheVille(List<String> villes) {
        this.villes = villes;
    }

    public void setVilles(List<String> villes) {
        this.villes = villes;
    }
}
