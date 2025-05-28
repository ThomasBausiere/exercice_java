package org.example;

import org.example.dao.AnimalDao;
import org.example.entity.Animal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        AnimalDao animalDao = new AnimalDao();

        animalDao.saveElement();



    }


}

