package org.example.product.service;

import org.example.product.entity.Product;
import org.example.product.exeception.NotFoundException;
import org.example.product.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product getProductById(Integer id){
        return productRepository.findById(id).orElseThrow(NotFoundException::new);
    }

    public Product create (Product product){
        return productRepository.save(product);
    }

    public List<Product> getAll(){
        return productRepository.findAll();
    }

    public void deleteProduct(Integer id){
        productRepository.deleteById(id);
    }


}
