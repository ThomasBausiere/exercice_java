package org.example.creational.factoryMethod;

public class CatFactory extends AnimalFactory{
    public Animal createAnimal(){
        return new Cat();
    }
}
