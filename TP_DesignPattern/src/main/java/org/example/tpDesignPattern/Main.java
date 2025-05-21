package org.example.tpDesignPattern;


import org.example.tpDesignPattern.decorator.GiftWraped;
import org.example.tpDesignPattern.factory.GameBoyFactory;
import org.example.tpDesignPattern.factory.ToyFactory;
import org.example.tpDesignPattern.model.Toy;

public class Main {
    public static void main(String[] args) {
        ToyFactory factory = new GameBoyFactory();
        Toy jouet = factory.createToy();
        jouet = new GiftWraped(jouet);

        System.out.println(jouet.getDescription());
        System.out.println(jouet.getCost());
    }


}
