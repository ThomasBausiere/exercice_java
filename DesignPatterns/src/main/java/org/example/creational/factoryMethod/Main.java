package org.example.creational.factoryMethod;

public class Main {
    public static void main(String[] args) {
        AnimalFactory catFactory = new CatFactory();
        Animal cat= catFactory.createAnimal();
        cat.makeSound();

        AnimalFactory dogFactory = new DogFactory();
        Animal dog =dogFactory.createAnimal();
        dog.makeSound();
    }
}
