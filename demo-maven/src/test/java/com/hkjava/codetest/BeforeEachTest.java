package com.hkjava.codetest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BeforeEachTest {
  private int count;

  @BeforeEach
  void setUp(){
    count = 5;
  }
  @Test
  void testIncrement(){
    count++;
    assertEquals(6, count);
  }

  @Test
  void testDecrement(){
    count--;
    assertEquals(4, count);
  }
}
