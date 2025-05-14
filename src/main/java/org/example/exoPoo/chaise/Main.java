package org.example.exoPoo.chaise;

public class Main {
    public static void main(String[] args) {
        Chaise chaise1 = new Chaise(4, "bois", "rouge");
        Chaise chaise2 = new Chaise(3, "métal", "bleu");
        Chaise chaise3 = new Chaise(2, "bamboo", "jaune");

        System.out.println(chaise1);

        Chaise[] chaises = {chaise1, chaise2, chaise3};

        for (Chaise chaise: chaises){
            System.out.println("--------");
            System.out.println(chaise);
        }
    }


}
