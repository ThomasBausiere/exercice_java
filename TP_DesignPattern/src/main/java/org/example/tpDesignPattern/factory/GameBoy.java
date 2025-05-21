package org.example.tpDesignPattern.factory;

import org.example.tpDesignPattern.model.Toy;

public class GameBoy implements Toy {


    @Override
    public String getDescription() {

        return "Game Boy";
    }

    @Override
    public double getCost() {
        return 10;
    }
}