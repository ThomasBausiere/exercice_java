package org.example.tpDesignPattern;


import org.example.tpDesignPattern.decorator.GiftWraped;
import org.example.tpDesignPattern.factory.GameBoyFactory;
import org.example.tpDesignPattern.factory.ToyFactory;
import org.example.tpDesignPattern.model.Toy;
import org.example.tpDesignPattern.observer.Subject;
import org.example.tpDesignPattern.observer.TheImp;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();


        TheImp imp1 = new TheImp("Gnaarg");
        TheImp imp2 = new TheImp("Bzzzarg");
        TheImp imp3 = new TheImp("Krruik");
        TheImp imp4 = new TheImp("Zaseeer");
        TheImp imp5 = new TheImp("Jooorzz");
        TheImp imp6 = new TheImp("Philippe");

        subject.addImp(imp1);
        subject.addImp(imp2);
        subject.addImp(imp3);
        subject.addImp(imp4);
        subject.addImp(imp5);
        subject.addImp(imp6);

        ToyFactory factory = new GameBoyFactory(subject);
        Toy jouet = factory.createToy();
        jouet = new GiftWraped(jouet);

        System.out.println(jouet.getDescription());
        System.out.println(jouet.getCost());
    }


}
