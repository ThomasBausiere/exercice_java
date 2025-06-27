package org.example;

import org.junit.Assert;
import org.junit.Test;

public class GradingCalculatorTest {

        private GradingCalculator gradingCalculator;

    @Test
    public void whenGetGrade_90_70_Then_A_OrWhenGetGrade_80_60_Then_B_OrWhenGetGrade_60_60_Then_C_OrWhenElse_Then_F(){
        //ARRANGE
        int a = 60;
        int b = 70;
        String result  = "";
        //ACT
        if(a > 90 && b > 70){
            result = "A";
        }else if(a > 80 && b > 60){
            result = "B";
        } else if (a > 60 && b > 60) {
            result = "C";
        }else{
            result = "F";
        }
        //ASSERT
        Assert.assertEquals("F", result);
    }
}
