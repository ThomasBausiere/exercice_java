package org.example.dao;

import org.example.entity.Computer;
import org.example.util.DataBaseManager;

import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

public class ComputerDao {

    private EntityManager em;

    public ComputerDao(){em = DataBaseManager.getEntityManager();}

    public Computer createComputer(Computer computer){
        em.getTransaction().begin();
        em.persist(computer);
        em.getTransaction().commit();
        return computer;
    }

    public Computer getComputerById(int id){
        return em.find(Computer.class, id);
    }

    public List<Computer> getAllComputer(){
        TypedQuery<Computer> query = em.createQuery("select c from Computer c", Computer.class);
        return query.getResultList();
    }

    public void updateComputer(int id, String name) {

        try {
            Computer computerToUpdate = getComputerById(id);
            em.getTransaction().begin();
            computerToUpdate.setModel(name);
            em.getTransaction().commit();

        } catch (EntityNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("computer updated");
    }

    public void deleteComputer(int id){
        Computer computerToDelete = getComputerById(id);
        if(computerToDelete != null){
            em.getTransaction().begin();
            em.remove(computerToDelete);
            em.getTransaction().commit();
        }
    }
}

