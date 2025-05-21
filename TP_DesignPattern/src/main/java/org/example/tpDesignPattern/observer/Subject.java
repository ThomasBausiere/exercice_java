package org.example.tpDesignPattern.observer;

import org.example.tpDesignPattern.model.Imp;
import org.example.tpDesignPattern.model.Toy;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Imp> imps = new ArrayList<>();

    public void addImp(Imp imp){
        this.imps.add(imp);
    }

    public void removeImp(Imp imp){
        this.imps.remove(imp);
    }

    public void notifyImp(Toy toy){
        for(Imp imp:imps){
            imp.confirm(toy);
        }
    }
}
