package org.example.creational;

import org.example.creational.builder.House;
import org.example.creational.builder.Person;

public class Main {
    public static void main(String[] args) {
//        Person person = new Person.Builder().firstName("toto").lastname("tata").age(42).build();
//        System.out.println(person);
//        Person person1 = new Person.Builder().age(22).build();
//        System.out.println(person1);
//        Person person2 = new Person.Builder().firstName("dazdza").lastname("tey").build();
//        System.out.println(person2);

        House house =new House.Builder().color("red").staires(2).roof("flat").pool(true).build();
        House house1= new House.Builder().staires(3).roof("yea, there is a roof").build();

        System.out.println(house1);
        System.out.println(house);
    }
}
