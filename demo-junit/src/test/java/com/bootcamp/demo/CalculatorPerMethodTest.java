package com.bootcamp.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_METHOD)
public class CalculatorPerMethodTest {
  private int x;

  @Test
  void testSum() {
    this.x += Calculator.sum2(1, 2);
    assertEquals(3, this.x);
  }

  @Test
  void testSum2() {
    this.x += Calculator.sum2(1, 2);
    assertEquals(3, this.x);
  }
}
