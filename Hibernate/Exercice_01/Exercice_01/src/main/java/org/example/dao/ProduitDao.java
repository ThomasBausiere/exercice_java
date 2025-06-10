package org.example.dao;

import org.example.entity.Produit;
import org.example.util.SessionFactorySingleton;

import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProduitDao extends BaseDao<Produit> {

    public ProduitDao(){
        super(SessionFactorySingleton.getSessionFactory(), Produit.class );
    }

    @Override
    public List<Produit>get(){
        try{
            session = sessionFactory.openSession();
            return session.createQuery("select p from Produit p", Produit.class).getResultList();

        }catch (Exception ex){
            return new ArrayList<>();
        }finally {
            session.close();
        }
    }

    public List<Produit> getByPrice(double prix){
        try{
            session.getSessionFactory().openSession();

            TypedQuery<Produit> query = session.createQuery("select p from Produit p where p.prix >= :prix", Produit.class);
            //System.out.println(session.createQuery("select p from Produit p where p.prix>= prix").getResultList());
            //return session.createQuery("select min(p) from Produit p where p.prix>= prix").getResultList();

            query.setParameter("prix", prix);
            return query.getResultList();
        }catch(Exception ex){
            return new ArrayList<>();
        }finally {
            session.close();
        }

    }

    public List<Produit> getProduitBy2dates(LocalDate date1, LocalDate date2){
        try{
            session.getSessionFactory().openSession();
       //     LocalDate date1= LocalDate.now().minusMonths(1);
       //      LocalDate date2= LocalDate.now();
            String request = "select p from Produit p where date between :startDate and :endDate ";
            Query query = session.createQuery(request);
            query.setParameter("startDate", date1);
            query.setParameter("endDate", date2);

            List<Produit> result = query.getResultList();
            return result;
        }catch (Exception ex){
            return new ArrayList<>();
        }finally {
            session.close();
        }
    }
}
