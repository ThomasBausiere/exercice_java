package org.example.util;

import org.example.dao.ProductDao;
import org.example.dao.Product_ElectronicDao;
import org.example.dao.Product_FoodDao;
import org.example.dao.Product_HousingDao;
import org.example.entity.Product;
import org.example.entity.Product_Electronic;
import org.example.entity.Product_Food;
import org.example.entity.Product_Housing;

import java.util.Scanner;

public class Ihm {
    private Scanner scanner;
    ProductDao productDao;
    Product_ElectronicDao productElectronicDao;
    Product_FoodDao productFoodDao;
    Product_HousingDao productHousingDao;

    public Ihm(){
        scanner = new Scanner(System.in);

        productDao = new ProductDao();
        productElectronicDao= new Product_ElectronicDao();
        productFoodDao = new Product_FoodDao();
        productHousingDao= new Product_HousingDao();
    }

    public void start(){

        String choix;
        do{
            menu();
            choix = scanner.nextLine();
            switch (choix){
                case "1":
                    addProductFood();
                    break;
                case "2":
                    addProductElectronic();
                    break;
                case "3":
                    addProductHousing();
                    break;
                case "4":
                    showAllProducts();
                    break;
                case "5":
                    showProductById();
                    break;
                case "6":
                    updateProduct();
                    break;
                case "7":
                    removeProduct();
                    break;

            }
        }
        while(!choix.equals("0"));
    }




    private void menu(){
        System.out.println("1 - Ajouter un produit alimentaire");
        System.out.println("2 - Ajouter un produit electronic");
        System.out.println("3 - Ajouter un produit logement");
        System.out.println("4 - Afficher les produits");
        System.out.println("5 - Afficher un produit");
        System.out.println("6 - Modifier un produit");
        System.out.println("7 - Supprimer un produit");
        System.out.println("0 - Quitter");
    }



    private void showAllProducts(){
        productDao.getAll();
        System.out.println(productDao.getAll());
    }
    private void showProductById(){
        System.out.println("saisir l'id du produit à afficher");
        int input = scanner.nextInt();
        scanner.nextInt();
        productDao.getById(input, Product.class);
        System.out.println(productDao.getById(input, Product.class));
    }
    private void updateProduct(){
        productDao.getById(input, Product.class)
    }
    private void removeProduct(){}

    private void addProductFood(){
        System.out.println("Nouveau Produit Alimentaire");
        System.out.println("Nouveau produit");
        System.out.println("Quel est le nom du produit?");
        String productName = scanner.nextLine();

        System.out.println("quel est son prix?");
        double productPrice = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Date d'expiration?");
        String expiryDate = scanner.nextLine();

        Product_Food productFood = Product_Food.builder().name(productName).price(productPrice).dateExpiration(expiryDate).build();
        productFoodDao.save(productFood);
    }
    private void addProductElectronic(){
        System.out.println("Nouveau produit Electronique");
        System.out.println("Nouveau produit");
        System.out.println("Quel est le nom du produit?");
        String productName = scanner.nextLine();
        System.out.println("quel est son prix?");
        double productPrice = scanner.nextDouble();
        System.out.println("Durée de la batterie?");
        double batteryDuration = scanner.nextDouble();
        Product_Electronic productElectronic= Product_Electronic.builder().name(productName).price(productPrice).duration(batteryDuration).build();
        productElectronicDao.save(productElectronic);
    }
    private void addProductHousing(){
        System.out.println("Nouveau produit d'intérieur");
        System.out.println("Nouveau produit");
        System.out.println("Quel est le nom du produit?");
        String productName = scanner.nextLine();
        System.out.println("quel est son prix?");
        double productPrice = scanner.nextDouble();
        System.out.println("What is the height?");
        double productHeight = scanner.nextDouble();
        System.out.println("What is the width?");
        double productWidth = scanner.nextDouble();
        Product_Housing productHousing= Product_Housing.builder().name(productName).price(productPrice).height(productHeight).width(productWidth).build();

        productHousingDao.save(productHousing);
    }










}
