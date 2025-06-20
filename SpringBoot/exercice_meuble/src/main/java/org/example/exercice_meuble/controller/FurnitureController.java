package org.example.exercice_meuble.controller;

import org.example.exercice_meuble.model.Furniture;
import org.example.exercice_meuble.service.FurnitureService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/furniture")
public class FurnitureController {

    private final FurnitureService furnitureService;

    public FurnitureController(FurnitureService furnitureService) {
        this.furnitureService = furnitureService;
    }

    @GetMapping
    public String listFurniture(Model model) {
        model.addAttribute("furnitures", furnitureService.getAllFurniture());
        return "furniture/list";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("furniture", new Furniture());
        return "furniture/add";
    }

    @PostMapping("/add")
    public String saveFurniture(@ModelAttribute Furniture furniture) {
        furnitureService.save(furniture);
        return "redirect:/furniture";
    }

    @GetMapping("/delete/{id}")
    public String deleteFurniture(@PathVariable Long id) {
        furnitureService.deleteFurniture(id);
        return "redirect:/furniture";
    }
}

