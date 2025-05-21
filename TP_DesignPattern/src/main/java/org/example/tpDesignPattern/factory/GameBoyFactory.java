package org.example.tpDesignPattern.factory;

import org.example.tpDesignPattern.model.Toy;

public class GameBoyFactory extends ToyFactory {


    @Override
    public Toy createToy() {
        return new GameBoy();
    }
}
