package org.example.exercice_05.controller.dao;

import org.example.exercice_05.controller.SessionFactorySingleton;
import org.example.exercice_05.model.Dog;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

public class DogDao extends BaseDao<Dog> {

    public DogDao() {
        super(SessionFactorySingleton.getSessionFactory(), Dog.class);
    }

    @Override
    public List<Dog> get() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("SELECT d FROM Dog d", Dog.class).getResultList();
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ArrayList<>();
        }
    }
}
