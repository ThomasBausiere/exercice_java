package org.example.dao;

import javax.persistence.*;

public abstract class BaseDao <T>{
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa_demo");
    EntityManager em = emf.createEntityManager();
    public BaseDao() {
        emf = Persistence.createEntityManagerFactory("exercice_01");
        em = emf.createEntityManager();
    }
    public abstract boolean saveElement(T element) throws EntityNotFoundException;
    public abstract T getById(int id) throws EntityNotFoundException;
    public abstract T getByName(String name) throws EntityNotFoundException;
    public abstract T getByAlimentation(String alimentation) throws EntityNotFoundException;
}
