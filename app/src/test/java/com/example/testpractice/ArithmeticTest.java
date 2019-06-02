package com.example.testpractice;

import org.junit.Assert;
import org.junit.Test;

import model.Arithmetic;

import static junit.framework.TestCase.assertEquals;


public class ArithmeticTest {
    @Test
    public void testAddition(){
        Arithmetic arithmetic=new Arithmetic();
        float expectedResult=20;
        float actualResult=arithmetic.add(14,6);
        assertEquals(expectedResult,actualResult);
    }

}
