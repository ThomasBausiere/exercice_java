package org.example.creational;

import org.example.creational.builder.House;

public class Main {
    public static void main(String[] args) {
        House house =new House.Builder()
                .color("red")
                .staires(2)
                .roof("flat")
                .pool(true)
                .build();
        House house1= new House.Builder()
                .staires(3)
                .roof("yea, there is a roof")
                .build();

        System.out.println(house1);
        System.out.println(house);
    }
}
