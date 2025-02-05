package com.bootcamp.demo;

public class InventoryService {
  private static InventoryService instance = new InventoryService();  // Singleton
  private int stockCount;

  private InventoryService() {
    this.stockCount = 0;
  }

  public static InventoryService getInstance() {
    return instance;
  }

  public int checkAvailableStock() {
    return stockCount;
  }

  public boolean deductStock() {
    this.stockCount--;
    return false;
  }
}
