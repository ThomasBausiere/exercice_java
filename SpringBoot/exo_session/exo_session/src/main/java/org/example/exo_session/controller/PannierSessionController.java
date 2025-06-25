package org.example.exo_session.controller;

import jakarta.servlet.http.HttpSession;
import org.example.exo_session.dto.ProduitResponseDto;
import org.example.exo_session.service.ProduitService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("produit/session")
public class PannierSessionController {
    private ProduitService produitService;
    private HttpSession session;

    public PannierSessionController(ProduitService produitService, HttpSession httpSession){
        this.produitService = produitService;
        session= httpSession;
    }

    @GetMapping("/pan/{id}")
    public ResponseEntity<String> ajouterAuPannier (@PathVariable long id){
        List<Long> panId = (List<Long>) session.getAttribute("pan");

        if(panId == null){
            panId = new ArrayList<>();
        }

        panId.add(produitService.get(id).getId());

        session.setAttribute("pan",panId);
        return ResponseEntity.ok("Produit ajouté au pannier");
    }

    @GetMapping("/getpan")
    public ResponseEntity<List<ProduitResponseDto>> getPan (){
        List<Long> panId = (List<Long>) session.getAttribute("pan");
        List<ProduitResponseDto> produitResponseDtos = new ArrayList<>();

        if(panId != null){
            for (long id : panId){
                produitResponseDtos.add(produitService.get(id));
            }
        }else{
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(new ArrayList<>());
        }
        return ResponseEntity.ok(produitResponseDtos);
    }

    @DeleteMapping("/pan/delete/{id}")
    public ResponseEntity<String> retirerDuPannier (@PathVariable long id){
        List<Long> panId = (List<Long>) session.getAttribute("pan");

        panId.remove(produitService.get(id).getId());

        session.setAttribute("pan",panId);
        return ResponseEntity.ok("Produit retiré du pannier");
    }

    @GetMapping("/validpan")
    public ResponseEntity<Double> valiPan (){
        List<Long> panId = (List<Long>) session.getAttribute("pan");
        List<ProduitResponseDto> produitResponseDtos = new ArrayList<>();
        double totalPrice = 0;

        if(panId != null){

            for (long id : panId){
                produitResponseDtos.add(produitService.get(id));
                totalPrice += produitService.get(id).getPrice();
            }
        }else{
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(totalPrice);
        }
        return ResponseEntity.ok(totalPrice);

    }


}
