package org.example;

import org.example.dao.ProduitDao;
import org.example.entity.Produit;
import org.example.util.SessionFactorySingleton;

import static java.time.LocalDate.now;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ProduitDao produitDao = new ProduitDao(SessionFactorySingleton.getSession());

        Produit produit01 = Produit.builder().marque("ShiroTm").reference("bayblade").date(now()).prix(100).stock(1).build();
        Produit produit02 = Produit.builder().marque("Togo & Cie").reference("Sweets").date(now()).prix(5).stock(999).build();
        Produit produit03 = Produit.builder().marque("Aldbern & fils").reference("Swords").date(now()).prix(50).stock(50).build();
        Produit produit04 = Produit.builder().marque("Kormir Visions").reference("Glass").date(now()).prix(999).stock(1).build();
        Produit produit05 = Produit.builder().marque("Gwen's Travel").reference("Travel stick").date(now()).prix(10).stock(99).build();

        produitDao.save(produit01);
        produitDao.save(produit02);
        produitDao.save(produit03);
        produitDao.save(produit04);
        produitDao.save(produit05);

        Produit foundThatProduit = produitDao.get(1);
        System.out.println(foundThatProduit);

        boolean deleteThatProduit = produitDao.delete(produitDao.get(3));
        System.out.println(deleteThatProduit);


        Produit produitToUpdate = produitDao.get(1);
        produitToUpdate.setMarque("Tagashi TM");
        produitToUpdate.setPrix(99);

        produitDao.save(produitToUpdate);

    }
}