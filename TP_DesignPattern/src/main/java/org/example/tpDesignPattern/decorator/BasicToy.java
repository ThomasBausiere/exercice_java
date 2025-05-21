package org.example.tpDesignPattern.model;

public class BasicToy implements Toy{
    @Override
    public String getDescription() {
        return "Jouet en parfait état";
    }

    @Override
    public double getCost() {
        return 25.00;
    }
}
