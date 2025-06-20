package org.example.exercice_meuble.service;


import org.example.exercice_meuble.dao.FurnitureRepository;
import org.example.exercice_meuble.model.Furniture;
import org.hibernate.sql.ast.tree.predicate.BooleanExpressionPredicate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FurnitureService {

    private final FurnitureRepository furnitureRepository;

    public FurnitureService(FurnitureRepository furnitureRepository) {
        this.furnitureRepository = furnitureRepository;
    }


    //saveFurniture
    public Furniture save(Furniture furniture){
        return furnitureRepository.save(furniture);
    }

    //getFurnitureById
    public Furniture getFurnitureById(Long id){
        return furnitureRepository.findById(id).orElse(null);
    }

    //getAllFurniture
    public List<Furniture> getAllFurniture(){
        return furnitureRepository.findAll();
    }

    //deleteFurniture

    public boolean deleteFurniture(Long id){
         furnitureRepository.deleteById(id);
         return true;

    }

}
