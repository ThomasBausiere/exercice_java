package org.example.demo1;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


public class GradingCalculatorTest {

        private GradingCalculator gradingCalculator;

//    Score : 95%, Présence : 90 => Note: A
    @Test
    public void whenGrade_95_AndPresence_90_ThenResult_A(){
        //ARRANGE
        int grade = 95;
        int presence = 90 ;
        char resultAwait = 'A';
        gradingCalculator = new GradingCalculator(grade, presence);
        //ACT
        char gradGet = gradingCalculator.getGrade();
        //ASSERT
        Assert.assertEquals(resultAwait, gradGet);
    }
//    Score : 85%, Présence : 90 => Note: B
    @Test
    public void whenGrade_85_AndPresence_90_ThenResult_B(){
        //ARRANGE
        int grade = 85;
        int presence = 90 ;
        char resultAwait = 'B';
        gradingCalculator = new GradingCalculator(grade, presence);
        //ACT
        char gradGet = gradingCalculator.getGrade();
        //ASSERT
        Assert.assertEquals(resultAwait, gradGet);
    }
//    Score : 65%, Présence : 90 => Note: C
    @Test
    public void whenGrade_65_AndPresence_90_ThenResult_C(){
        //ARRANGE
        int grade = 65;
        int presence = 90 ;
        char resultAwait = 'C';
        gradingCalculator = new GradingCalculator(grade, presence);
        //ACT
        char gradGet = gradingCalculator.getGrade();
        //ASSERT
        Assert.assertEquals(resultAwait, gradGet);
    }
//    Score : 95%, Présence : 65 => Note: B
    @Test
    public void whenGrade_95_AndPresence_65_ThenResult_B(){
        //ARRANGE
        int grade = 95;
        int presence = 65 ;
        char resultAwait = 'B';
        gradingCalculator = new GradingCalculator(grade, presence);
        //ACT
        char gradGet = gradingCalculator.getGrade();
        //ASSERT
        Assert.assertEquals(resultAwait, gradGet);
    }
//    Score : 95%, Présence : 55 => Note: F
    @Test
    public void whenGrade_95_AndPresence_55_ThenResult_F(){
        //ARRANGE
        int grade = 95;
        int presence = 55;
        char resultAwait = 'F';
        gradingCalculator = new GradingCalculator(grade, presence);
        //ACT
        char gradGet = gradingCalculator.getGrade();
        //ASSERT
        Assert.assertEquals(resultAwait, gradGet);
    }
//    Score : 65%, Présence : 55 => Note: F
    @Test
    public void whenGrade_65_AndPresence_55_ThenResult_F(){
        //ARRANGE
        int grade = 65;
        int presence = 55;
        char resultAwait = 'F';
        gradingCalculator = new GradingCalculator(grade, presence);
        //ACT
        char gradGet = gradingCalculator.getGrade();
        //ASSERT
        Assert.assertEquals(resultAwait, gradGet);
    }
//    Score : 50%, Présence : 90 => Note: F
    @Test
    public void whenGrade_50_AndPresence_90_ThenResult_F(){
        //ARRANGE
        int grade = 50;
        int presence = 90;
        char resultAwait = 'F';
        gradingCalculator = new GradingCalculator(grade, presence);
        //ACT
        char gradGet = gradingCalculator.getGrade();
        //ASSERT
        Assert.assertEquals(resultAwait, gradGet);
    }

    @ParameterizedTest
    @MethodSource("providerParameters")
    public void whenGradeAndPresenceThenResultAwaitGrade(int grade, int presence, char awaitedGrade){
    //ARRANGE
        gradingCalculator = new GradingCalculator(grade, presence);
    //ACT
        char gradGet = gradingCalculator.getGrade();
    //ASSERT
        Assert.assertEquals(awaitedGrade, gradGet);
    }
    private static Stream<Arguments> providerParameters(){
        return Stream.of(
                Arguments.of(95, 90, 'A'),
                Arguments.of(85, 90, 'B'),
                Arguments.of(65, 90, 'C'),
                Arguments.of(95, 65, 'B'),
                Arguments.of(95, 55, 'F'),
                Arguments.of(65, 55, 'F'),
                Arguments.of(50, 90, 'F')
        );
    }

    @ParameterizedTest
    @CsvSource({
            "95, 90, A",
            "85, 90, B",
            "65, 90, C",
            "95, 65, B",
            "95, 55, F",
            "65, 55, F",
            "50, 90, F",
    })
    public void whenGradeAndPresenceThenResultAwaitGradee(int grade, int presence, char awaitedGrade){
        //ARRANGE
        gradingCalculator = new GradingCalculator(grade, presence);
        //ACT
        char gradGet = gradingCalculator.getGrade();
        //ASSERT
        Assert.assertEquals(awaitedGrade, gradGet);
    }



}
