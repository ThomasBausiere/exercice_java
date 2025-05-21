package org.example.tpDesignPattern.observer;

import org.example.tpDesignPattern.model.Imp;
import org.example.tpDesignPattern.model.Toy;

public class TheImp implements Imp {

    private String name;

    public TheImp(String name){
            this.name=name;
    }
    @Override
    public void confirm(Toy toy) {
        System.out.println(name+" a reçu la notification de "+ toy.getDescription());
    }
}
