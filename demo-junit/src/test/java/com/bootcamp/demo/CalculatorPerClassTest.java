package com.bootcamp.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
@TestMethodOrder(OrderAnnotation.class)
@DisplayName("Calculator Tests")
public class CalculatorPerClassTest {
  private int x;

  @BeforeAll
  void initAll() {
    System.out.println("Before all tests");
  }

  @AfterAll
  void AfterAll() {
    System.out.println("After all tests");
  }

  @BeforeEach
  void reset() {
    System.out.println("Before each test, reset something..."); // reset something before each test
  }

  @AfterEach
  void clear() {
    System.out.println("After each test, clear something..."); // clear something after each test
  }

  @Test
  @Order(1)
  void testSum() {
    System.out.println("Test case 1");
    this.x += Calculator.sum2(1, 2);
    assertEquals(3, this.x);
  }

  @Test
  @Order(2)
  void testSum2() {
    System.out.println("Test case 2");
    this.x += Calculator.sum2(1, 2);
    assertEquals(6, this.x);
  }
}
