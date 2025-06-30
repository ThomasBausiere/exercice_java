package org.example.service;
import org.example.exception.NotFoundException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.*;
import org.mockito.Mockito;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.List;

public class RechercheVilleTest {

    private RechercheVille recherche;
//    Etapes du projet:
//            1. Si le texte de la recherche contient moins de 2 caractères,
//            ***Une exception est levée de type NotFoundException***.
    @Test
    public void whenLongueurTexteRecherche_Inferieur_A_2_ThenThrowError(){
        //ARRANGE

            String mot = "";
        List<String> villes = List.of(
        "Paris", "Budapest", "Skopje", "Rotterdam",
        "Valence", "Vancouver", "Amsterdam", "Vienne",
        "Sydney", "New York", "Londres", "Bangkok",
        "Hong Kong", "Dubaï", "Rome", "Istanbul");
        recherche = new RechercheVille(villes);

        //ACT
            //boolean isNotLongEnough = mot.length() < 2;

        //ASSERT
        Assert.assertThrows(NotFoundException.class,() -> {recherche.rechercher(mot);});


    }

//            2. Si le texte de recherche est égal ou supérieur à 2 caractères, il doit renvoyer tous les noms de ville commençant par le texte de recherche exact.
//                  Par exemple, pour le texte de recherche "Va", la fonction doit renvoyer Valence et Vancouver

            @Test
            public void whenLongueurRechercheIsSupOuEgaleA_2_ThenReturnAllNameStartingWithRecherche(){
                //ARRANGE
                String mot = "Va";
                List<String> villes = List.of(
                        "Paris", "Budapest", "Skopje", "Rotterdam",
                        "Valence", "Vancouver", "Amsterdam", "Vienne",
                        "Sydney", "New York", "Londres", "Bangkok",
                        "Hong Kong", "Dubaï", "Rome", "Istanbul");
                recherche = new RechercheVille(villes);
                List<String> expected = List.of("Valence", "Vancouver");
                //ACT


                //ASSERT

                Assert.assertEquals(expected, mot);
            }

//           3. La fonctionnalité de recherche doit être insensible à la casse
//             4. La fonctionnalité de recherche devrait également fonctionner lorsque le texte de recherche n'est qu'une partie d'un nom de ville
//                  Par exemple "ape" devrait renvoyer la ville "Budapest"
//            5. Si le texte de recherche est un « * » (astérisque), il doit renvoyer tous les noms de ville.
}



