package org.example.exercice_meuble.dao;

import org.example.exercice_meuble.model.Furniture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FurnitureRepository extends JpaRepository<Furniture, Long> {
}
