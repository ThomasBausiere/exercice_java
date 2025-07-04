package org.example.dao;

import org.example.util.DataBaseManager;

import javax.persistence.EntityManager;

public abstract class BaseDao<T> {

    protected     EntityManager em;

    public BaseDao(){
        em = DataBaseManager.getEntityManager();
    }

    public T save(T element) {
        em.getTransaction().begin();
        em.persist(element);
        em.getTransaction().commit();
        return element;
    }

    public  T getById(int id, Class<T> tClass) {
        return em.find(tClass, id);
    }

    public T update(T element) {
        try {
            em.getTransaction();
            em.merge(element);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
            return null;
    }

    public boolean delete( int id, Class<T> tClass){
        T elementFound= getById(id, tClass);
        if(elementFound != null){
            em.getTransaction().begin();
            em.remove(elementFound);
            em.getTransaction().commit();
            return true;
        }
        return false;
    }

}
