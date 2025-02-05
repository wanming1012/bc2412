package com.bootcamp.demo;

public class Calculator {
  
  public static int methodB(int a) {
    return a + sum(a, a + 2);
  }

  public static int sum(int x, int y) {
    return x + y + 1;
  }

  public static int sum2(int x, int y) {
    return x + y;
  }
}
