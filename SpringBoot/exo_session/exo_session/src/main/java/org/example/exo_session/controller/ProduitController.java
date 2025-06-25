package org.example.exo_session.controller;

import org.example.exo_session.dto.ProduitReceiveDto;
import org.example.exo_session.dto.ProduitResponseDto;
import org.example.exo_session.service.ProduitService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produit")
public class ProduitController {

    ProduitService produitService;

    public ProduitController (ProduitService produitService){
        this.produitService = produitService;
    };

    //CREATE
    @PostMapping
    public ResponseEntity<ProduitResponseDto> create(@RequestBody ProduitReceiveDto produitReceiveDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(produitService.create(produitReceiveDto));
    }
    //READ ONE
    @GetMapping("/{id}")
    public ResponseEntity<ProduitResponseDto> get (@PathVariable long id){
        return ResponseEntity.ok(produitService.get(id));
    }
    //READ ALL
    @GetMapping
    public ResponseEntity<List<ProduitResponseDto>> getAll (){
        return ResponseEntity.ok(produitService.getAll());
    }
    //UPDATE
    @PutMapping("/{id}")
    public ResponseEntity<ProduitResponseDto> update (@PathVariable long id, @RequestBody ProduitReceiveDto produitReceiveDto){
        return ResponseEntity.ok(produitService.update(id,produitReceiveDto));
    }
    //DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete (@PathVariable long id){
        produitService.delete(id);
        return ResponseEntity.ok("Deleted") ;
    }

}
