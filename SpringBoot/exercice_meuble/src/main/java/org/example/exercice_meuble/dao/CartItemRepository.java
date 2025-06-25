package org.example.exercice_meuble.dao;

import org.example.exercice_meuble.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
    CartItem findByFurnitureId(Long furnitureId);
}
