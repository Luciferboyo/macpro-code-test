package com.hkjava.codetest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BeforeAllTest {
  private int total;

  @BeforeAll
  void setUp(){
    total = 0;
  }

  @Test
  void testAddition(){
    total += 5;
    assertEquals(5, total);
  }

  @Test
  void testSubtraction(){
    total -= 3;
    assertEquals(2, total);
  }
}
