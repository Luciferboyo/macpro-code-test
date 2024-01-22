package com.hkjava.codetest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class AfterAllExample {
  
  private int count;

  @AfterAll
  void tearDown(){
    count = 0;
  }

  @Test
  void TestInstance(){
    count++;
    assertEquals(1, count);
  }

  @Test
  void TestDecrement(){
    count--;
    assertEquals(0, count);
  }
}
