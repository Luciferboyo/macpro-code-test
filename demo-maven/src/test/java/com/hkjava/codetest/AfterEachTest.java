package com.hkjava.codetest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class AfterEachTest {
  
  private StringBuilder stringBuilder;

  @AfterEach
  void tearDown(){
    stringBuilder = null;
  }

  @Test
  void testAppend(){
    stringBuilder = new StringBuilder("Hello");
    stringBuilder.append("World");
  }

  @Test
  void testClear(){
    stringBuilder = new StringBuilder("JUnit");
    stringBuilder.setLength(0);
  }
}
