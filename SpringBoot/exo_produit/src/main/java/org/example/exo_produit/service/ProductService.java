package org.example.exo_produit.service;

import org.example.exo_produit.model.Product;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

import java.util.Map;
import java.util.UUID;


@Service
public class ProductService {

        private final Map<UUID, Product> products;


public ProductService(){
    products = new HashMap<>();

    Product product1 = Product.builder()
            .id(UUID.randomUUID())
            .name("Produit 1")
            .category("Alimentaire")
            .price(12.99)
            .build();
    Product product2 = Product.builder()
            .id(UUID.randomUUID())
            .name("Produit 2")
            .category("Alimentaire")
            .price(22.99)
            .build();
    Product product3 = Product.builder()
            .id(UUID.randomUUID())
            .name("Produit 3")
            .category("console")
            .price(152.99)
            .build();
    Product product4 = Product.builder()
            .id(UUID.randomUUID())
            .name("Produit 4")
            .category("console")
            .price(252.99)
            .build();
    this.products.put(product1.getId(), product1);
    this.products.put(product2.getId(), product2);
    this.products.put(product3.getId(), product3);
    this.products.put(product4.getId(), product4);


}


        public List<Product> getAllProducts(){
            return this.products.values().stream().toList();
        }

    public Product getProductByID(UUID id){
        return this.products.get(id);
    }

    public Product getProductByCategoryAndPrice(String category, double price){
        return this.products.values().stream()
                .filter(c -> c.getCategory().equals(category))
                .filter(c -> c.getPrice()<=(price)).findAny().orElse(null);
    }
}
