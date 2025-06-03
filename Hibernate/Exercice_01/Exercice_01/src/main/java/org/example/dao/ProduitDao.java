package org.example.dao;


import org.example.entity.Produit;
import org.hibernate.Session;

import java.util.List;

public class ProduitDao {
    private Session session;

    public ProduitDao(Session session){this.session= session;}

    public Produit save(Produit produit){
        session.beginTransaction();
//        session.getTransaction().begin();
        session.saveOrUpdate(produit);
        session.getTransaction().commit();
        return produit;
    }

    public boolean delete (Produit produit){
        session.beginTransaction();
        session.delete(produit);
        session.getTransaction().commit();
        return true;
    }

    public Produit get(int id){
        return session.get(Produit.class, id);}

    public List<Produit> get(){
        return session.createQuery("select p from Produit p", Produit.class).getResultList();
    }
}
