package org.example.exercice_05.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public abstract class BaseDao<T> {

    protected final SessionFactory sessionFactory;
    protected final Class<T> type;

    protected BaseDao(SessionFactory sessionFactory, Class<T> type) {
        this.sessionFactory = sessionFactory;
        this.type = type;
    }

    public T save(T element) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.saveOrUpdate(element);
            session.getTransaction().commit();
            return element;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public boolean delete(int id) {
        try (Session session = sessionFactory.openSession()) {
            T found = session.get(type, id);
            if (found != null) {
                session.beginTransaction();
                session.delete(found);
                session.getTransaction().commit();
                return true;
            } else {
                System.out.println("Element with id " + id + " not found.");
                return false;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public T get(int id) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(type, id);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public abstract List<T> get();
}
