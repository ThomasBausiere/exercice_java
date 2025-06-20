package org.example.exercice_meuble.controller;

import org.example.exercice_meuble.service.CartItemService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/cart")
public class CartController {

    private final CartItemService cartService;

    public CartController(CartItemService cartService) {
        this.cartService = cartService;
    }

    @GetMapping
    public String showCart(Model model) {
        model.addAttribute("cartItems", cartService.getAllCartItems());
        return "cart/view";
    }

    @PostMapping("/add")
    public String addToCart(@RequestParam Long furnitureId, @RequestParam int quantity) {
        cartService.addToCart(furnitureId, quantity);
        return "redirect:/cart";
    }

    @PostMapping("/remove")
    public String removeFromCart(@RequestParam Long furnitureId, @RequestParam int quantity) {
        cartService.removeFromCart(furnitureId, quantity);
        return "redirect:/cart";
    }

    @GetMapping("/clear")
    public String clearCart() {
        cartService.clearCart();
        return "redirect:/cart";
    }
}

