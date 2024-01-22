package com.hkjava.codetest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

//Junit5

/**
 * Unit test for simple App.
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ClassTest{
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
