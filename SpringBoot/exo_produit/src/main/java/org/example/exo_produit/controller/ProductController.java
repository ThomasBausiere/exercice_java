package org.example.exo_produit.controller;


import lombok.Value;
import org.example.exo_produit.model.Product;
import org.example.exo_produit.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller
public class    ProductController {

    private final ProductService productService;

    public ProductController(ProductService contactService) {
        this.productService = contactService;
    }

    @Value("${my.custom.value")
        private String titre;

    @GetMApping()
    public String home(Model model){
        model.addAttribute("titre",titre);
        return "redirect:/list";
    }

    @GetMapping("/")
    public String homepage(){
        return "redirect:/list";
    }

    @GetMapping("/list")
    public String list(Model model){
        List<Product> products = productService.getAllProducts();
        model.addAttribute("products", products);
        return "pagelist";
    }

    @GetMapping("/detail/{productId}")
    public String detailPage(@PathVariable("productId") UUID productId, Model model){
        Product product = productService.getProductByID(productId);
        model.addAttribute("product", product);
        System.out.println(product);
        return "productpage";

    }

    @GetMapping("/search") //http://localhost:8080/search?category=console&price=280
    public String showProductFiltred(@RequestParam(value = "category") String category,
                                      @RequestParam(value = "price") double price, Model model){
       List<Product> products = productService.getProductByCategoryAndPrice(category, price);

           model.addAttribute("products", products);
           return "pagelist";


    }


}
