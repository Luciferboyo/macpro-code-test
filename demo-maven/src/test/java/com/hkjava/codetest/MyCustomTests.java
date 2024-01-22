package com.hkjava.codetest;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("myCustomTests")
public class MyCustomTests {
  @Test
  void additionTest(){
    String value = "helloworld!";
    int result = 2+2;
    assertEquals(4, result);
    assertAll(
      () -> assertEquals("helloworld!", value)
    );
    //asserTrue and assertFalse
    assertTrue(result>3);
    assertFalse(result > 6);
    int[] integers1 = new int[]{1,2,3,4,5};
    int[] integers2 = new int[]{1,2,3,4,5};

    assertArrayEquals(integers1,integers2);
    assertSame(integers1, integers1);

    assertThrows(ArithmeticException.class,()->{
      int res = 1/0;
    });

    assertDoesNotThrow(()->{
      int res = 2+2;
    });
    assertTimeout(Duration.ofMillis(100), ()->{
      Thread.sleep(50);
    });
    
  }
}
