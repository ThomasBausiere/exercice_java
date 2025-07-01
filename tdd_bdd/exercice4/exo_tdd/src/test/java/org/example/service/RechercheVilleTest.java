package org.example.service;
import org.example.exception.NotFoundException;
import org.junit.Assert;
import org.junit.Test;


import java.util.List;

public class RechercheVilleTest {

    private RechercheVille recherche;

    List<String> villes = List.of(
            "Paris", "Budapest", "Skopje", "Rotterdam",
            "Valence", "Vancouver", "Amsterdam", "Vienne",
            "Sydney", "New York", "Londres", "Bangkok",
            "Hong Kong", "Dubaï", "Rome", "Istanbul");

//1. Si le texte de la recherche contient moins de 2 caractères => Une exception de type NotFoundException est levée
   @Test
    public void whenLongueurTexteRecherche_Inferieur_A_2_ThenThrowError(){
        //ARRANGE
        String mot = "";
        recherche = new RechercheVille(villes);
        //ACT n ASSERT
        Assert.assertThrows(NotFoundException.class,() -> {recherche.rechercher(mot);});
    }

//2. Si le texte de recherche est égal ou supérieur à 2 caractères, il doit renvoyer tous les noms de ville commençant par le texte de recherche exact.
            @Test
            public void whenLongueurRechercheIsSupOuEgaleA_2_ThenReturnAllNameStartingWithRecherche(){
                //ARRANGE
                String mot = "Va";
                recherche = new RechercheVille(villes);
                List<String> expected = List.of("Valence", "Vancouver");
                //ACT
                List<String> result = recherche.rechercher(mot);
                //ASSERT
                Assert.assertEquals(expected, result);
            }

//3. La fonctionnalité de recherche doit être insensible à la casse
//             4. La fonctionnalité de recherche devrait également fonctionner lorsque le texte de recherche n'est qu'une partie d'un nom de ville
//                  Par exemple "ape" devrait renvoyer la ville "Budapest"
//            5. Si le texte de recherche est un « * » (astérisque), il doit renvoyer tous les noms de ville.
}



