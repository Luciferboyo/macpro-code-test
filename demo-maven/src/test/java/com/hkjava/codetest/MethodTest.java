package com.hkjava.codetest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//Junit5

/**
 * Unit test for simple App.
 */
public class MethodTest {
    private int count;

    @Test
    void testMethod1(){
        count++;
        Assertions.assertEquals(1, count);
    }

    @Test
    void testMethod2(){
        count++;
        Assertions.assertEquals(1, count);
    }
}
