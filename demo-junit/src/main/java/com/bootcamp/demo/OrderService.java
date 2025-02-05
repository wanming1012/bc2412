package com.bootcamp.demo;

public class OrderService {
  private PaymentService paymentService;
  private InventoryService inventoryService;

  public OrderService(PaymentService paymentService, InventoryService inventoryService) {
    this.paymentService = paymentService;
    this.inventoryService = inventoryService;
  }

  public boolean order() {
    if (this.inventoryService.checkAvailableStock() <= 0)
      throw new IllegalStateException();

    return this.paymentService.pay() && this.inventoryService.deductStock();
  }

  public static void main(String[] args) {
    PaymentService paymentService = new PaymentService();
    InventoryService inventoryService = InventoryService.getInstance();

    OrderService os1 = new OrderService(paymentService, inventoryService);
    OrderService os2 = new OrderService(paymentService, inventoryService);
  }
}
