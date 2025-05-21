package org.example.tpDesignPattern.model;

public abstract class ToyDecorator implements Toy {
    protected Toy toy;

    public ToyDecorator(Toy toy) {
        this.toy = toy;
    }
    @Override
    public String getDescription() {
        return toy.getDescription();
    }
    @Override
    public double getCost() {
        return toy.getCost();
    }
}
