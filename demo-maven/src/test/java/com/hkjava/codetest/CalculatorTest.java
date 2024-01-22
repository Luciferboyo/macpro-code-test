package com.hkjava.codetest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Calculator Tests")
public class CalculatorTest {
  
  private int x ;

  @DisplayName("Addtion Test")
  @Test
  void testAddtion(){
    x++;
    assertEquals(1, x);
  }

  @Test
  @DisplayName("Subtraction Test")
  void testSubtraction(){
    x--;
    assertEquals(-1, x);
  }
}
