package org.example.exercice_meuble.service;

import org.example.exercice_meuble.dao.CartItemRepository;
import org.example.exercice_meuble.dao.FurnitureRepository;
import org.example.exercice_meuble.model.CartItem;
import org.example.exercice_meuble.model.Furniture;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CartItemService {

    private final CartItemRepository cartItemRepository;
    private final FurnitureService furnitureService;
    private final FurnitureRepository furnitureRepository;

    public CartItemService(CartItemRepository cartItemRepository, FurnitureService furnitureService, FurnitureRepository furnitureRepository) {
        this.cartItemRepository = cartItemRepository;
        this.furnitureService = furnitureService;

        this.furnitureRepository = furnitureRepository;

    }



    public List<CartItem> getAllCartItems(){
        return cartItemRepository.findAll();
    }

    //addToCart
    public boolean addToCart(Long furnitureId, int quantity){

        Furniture furniture = furnitureRepository.findById(furnitureId).orElse(null);
        if(furniture == null || furniture.getStock() < quantity){
            return false;
        }

        CartItem cartItem = CartItem.builder()
                .furniture(furniture)
                .quantity(quantity)
                .build();
        cartItemRepository.save(cartItem);
        return true;
    }



    //removeFromCart
    public boolean removeFromCart(Long furnitureId, int quantity) {
        Optional<CartItem> optionalItem = cartItemRepository.findByFurnitureId(furnitureId);

        if (optionalItem.isEmpty()) return false;

        CartItem item = optionalItem.get();

        if (item.getQuantity() <= quantity) {
            cartItemRepository.delete(item);
        } else {
            item.setQuantity(item.getQuantity() - quantity);
            cartItemRepository.save(item);
        }

        return true;
    }
    //clearCart
    public void clearCart() {
        cartItemRepository.deleteAll();
    }

}
