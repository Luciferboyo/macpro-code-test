package com.hkjava.codetest;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;;

@TestMethodOrder(OrderAnnotation.class)
public class CustomTestMethodOrderExample {
  
  @Test
  @Order(3)
  void testMethod1(){
    
  }

  @Test
  @Order(2)
  void testMethod2(){
    
  }

  @Test
  @Order(1)
  void testMethod3(){
    
  }
}
