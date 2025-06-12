package org.example.exercice_05.config;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.hibernate.SessionFactory;

public class SessionFactorySingleton {

    private static SessionFactory sessionFactory;

    private SessionFactorySingleton() {
        // Empêche l’instanciation
    }

    public static synchronized SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("j2ee_exo_pu");
            sessionFactory = emf.unwrap(SessionFactory.class);
        }
        return sessionFactory;
    }
}
