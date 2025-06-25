package org.example.exo_session.service;

import org.example.exo_session.dto.ProduitReceiveDto;
import org.example.exo_session.dto.ProduitResponseDto;
import org.example.exo_session.entity.Produit;
import org.example.exo_session.exception.NotFoundException;
import org.example.exo_session.repository.ProduitRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitService {

    ProduitRepository produitRepository;

    public ProduitService(ProduitRepository produitRepository){
        this.produitRepository = produitRepository;
    }
    //CREATE
    public ProduitResponseDto create (ProduitReceiveDto produitReceiveDto){
        return produitRepository.save(produitReceiveDto.dtoToEntity()).entityToDto();
    }
    //READ
    public ProduitResponseDto get(long id){
        return produitRepository.findById(id).orElseThrow(NotFoundException::new).entityToDto();
    }
    //READ ALL
    public List<ProduitResponseDto> getAll(){
        return produitRepository.findAll().stream().map(Produit::entityToDto).toList();
    }
    //UPDATE
    public ProduitResponseDto update(long id,ProduitReceiveDto produitReceiveDto){
        Produit produitFound = produitRepository.findById(id).orElseThrow(NotFoundException::new);
        Produit produitGet = produitReceiveDto.dtoToEntity();
        produitFound.setName(produitGet.getName());
        produitFound.setPrice(produitGet.getPrice());
        return produitRepository.save(produitFound).entityToDto();
    }
    //DELETE
    public boolean delete(long id){
        produitRepository.deleteById(id);
        return true;
    }
}
