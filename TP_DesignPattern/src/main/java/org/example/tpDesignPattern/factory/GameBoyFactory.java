package org.example.tpDesignPattern.factory;

import org.example.tpDesignPattern.model.Toy;
import org.example.tpDesignPattern.observer.Subject;

public class GameBoyFactory extends ToyFactory {

    private Subject subject;
    public GameBoyFactory(Subject subject) {
        this.subject=subject;
    }

    @Override
    public Toy createToy() {
        Toy toy = new GameBoy();
        subject.notifyImp(toy);
        return new GameBoy();
    }
}
