package org.example.demo2;


import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class JeuTest {

    private Jeu jeu;
    private Ide de = Mockito.mock(Ide.class);

    @Test
    public void whenDeLancerValue20_ThenJeuReturnTrue(){
        //ARRANGE
            jeu = new Jeu(de);
            Mockito.when(de.lancer()).thenReturn(20);
        //ACT
        boolean result =  jeu.jouer();

        //ASSERT

        Assert.assertTrue(result);
    }

    @Test
    public void whenDeLancerWithValue_2_ThenJeuReturnFalse(){
        //ARRANGE
        jeu = new Jeu(de);
        Mockito.when(de.lancer()).thenReturn(2);
        //ACT
        boolean result =  jeu.jouer();
        //ASSERT
        Assert.assertFalse(result);
    }


}
