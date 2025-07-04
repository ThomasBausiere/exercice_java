package org.example.demo1;

import org.junit.Assert;
import org.junit.Test;

public class GradingCalculatorTestInitial {

        private GradingCalculator gradingCalculator;

    @Test
    public void whenGetGrade_90_70_Then_A(){
        //ARRANGE
        int a = 91;
        int b = 71;
        String result  = "";
        //ACT
        if(a > 90 && b > 70){
            result = "A";
        }
        //ASSERT
        Assert.assertEquals("A", result);
    }

    @Test
    public void whenGetGrade_80_60_Then_B(){
        int a = 81;
        int b = 61;
        String result  = "";
        if(a > 80 && b > 60){
            result = "B";
        }
        //ASSERT
        Assert.assertEquals("B", result);
    }
    @Test
    public void whenGetGrade_60_60_Then_C() {
        int a = 61;
        int b = 61;
        String result = "";
        if (a > 60 && b > 60) {
            result = "C";
        }
        //ASSERT
        Assert.assertEquals("C", result);
    }
    @Test
    public void whenElse_Then_F(){
                int a = 00;
                int b = 00;
                String result  = "";
            if (a <= 60 || b <= 60) {
                result = "F";
            }
            //ASSERT
            Assert.assertEquals("F", result);
    }
}
