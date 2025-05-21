package org.example.tpDesignPattern.decorator;

import org.example.tpDesignPattern.model.Toy;
import org.example.tpDesignPattern.model.ToyDecorator;

public class GiftWraped extends ToyDecorator {
    public GiftWraped(Toy toy) {super(toy);}

    @Override
    public String getDescription() {
        return super.getDescription()+" emballé dans un super papier cadeau !";
    }

    @Override
    public double getCost() {
        return super.getCost()+ 5;
    }
}
