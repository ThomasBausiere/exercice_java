package org.example.dao;

import org.example.entity.Product;

import java.util.List;

public class ProductDao extends BaseDao<Product> {

    public  List<Product> getAll(){
        return em.createQuery("Select p from Product p", Product.class).getResultList();
    }
}
