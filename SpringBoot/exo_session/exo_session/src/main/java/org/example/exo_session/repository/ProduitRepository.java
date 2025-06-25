package org.example.exo_session.repository;

import org.example.exo_session.entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository <Produit, Long> {
}
