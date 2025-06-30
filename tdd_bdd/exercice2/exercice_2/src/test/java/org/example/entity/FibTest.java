package org.example.entity;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class FibTest {
    private Fib fib;

//    Lors du déclenchement de la fonction GetFibSeries() avec un Range de 1
//    - Le résultat n’est pas vide
    @ParameterizedTest
    @MethodSource("param")
    public void whenRange_1_Then_ResultIsNotEmpty(param){
        //ARRANGE
        fib = new Fib(1);
        int ResultAwait ;
        //ACT
        fib.getFibSeries(){

        }
        private static Stream<Argu>
    }
//    - Le résultat correspond à une liste qui contient {0}

//    Lors du déclenchement de la fonction GetFibSeries() avec un Range de 6
//    - Le résultat contient le chiffre 3
//    - Le résultat contient 6 éléments
//    - Le résultat n’a pas le chiffre 4 en son sein
//    - Le résultat correspond à une liste qui contient {0, 1, 1, 2, 3, 5}
//    - Le résultat est trié de façon ascendente.
}
