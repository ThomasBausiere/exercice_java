package org.example.creational.factoryMethod;

public class DogFactory extends AnimalFactory{
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
