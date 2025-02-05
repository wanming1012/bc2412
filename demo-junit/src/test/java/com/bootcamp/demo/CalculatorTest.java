package com.bootcamp.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {
  @Test
  void testSum() {
    // TC1: 1 + 2 = 3
    // TC2: -1 + 3 = 2
    // TC3: 0 + 0 = 0
    Assertions.assertEquals(4, Calculator.sum(1, 2));
    Assertions.assertEquals(3, Calculator.sum(-1, 3));
    Assertions.assertEquals(1, Calculator.sum(0, 0));
  }

  @Test
  void testSum2() {
    Assertions.assertEquals(-3, Calculator.sum(-1, -3));
  }

  @Test
  void testMethodB() {
    Assertions.assertEquals(24, Calculator.methodB(7));
  }
}
