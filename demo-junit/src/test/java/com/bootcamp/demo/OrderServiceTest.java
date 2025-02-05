package com.bootcamp.demo;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.verify;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class OrderServiceTest {
  @Mock
  private PaymentService paymentService;

  @Mock
  private InventoryService inventoryService;
  
  @Test
  void testOrder() {
    Mockito.when(this.inventoryService.checkAvailableStock()).thenReturn(10);
    Mockito.when(this.inventoryService.deductStock()).thenReturn(true);
    Mockito.when(this.paymentService.pay()).thenReturn(true);

    OrderService os = new OrderService(this.paymentService, this.inventoryService);

    assertTrue(os.order());
    //assertDoesNotThrow(() -> os.order());

    verify(this.inventoryService, Mockito.times(1)).checkAvailableStock();
    verify(this.inventoryService, Mockito.times(1)).deductStock();
    verify(this.paymentService, Mockito.times(1)).pay();
  }

  @Test
  void testOrder3() {
    Mockito.when(this.inventoryService.checkAvailableStock()).thenReturn(10);
    Mockito.when(this.inventoryService.deductStock()).thenReturn(false);
    Mockito.when(this.paymentService.pay()).thenReturn(true);

    OrderService os = new OrderService(this.paymentService, this.inventoryService);

    assertFalse(os.order());
  }

  @Test
  void testOrder4() {
    Mockito.when(this.inventoryService.checkAvailableStock()).thenReturn(10);
    //Mockito.when(this.inventoryService.deductStock()).thenReturn(true);
    Mockito.when(this.paymentService.pay()).thenReturn(false);

    OrderService os = new OrderService(this.paymentService, this.inventoryService);

    assertFalse(os.order());
  }

  @Test
  void testOrder2() {
    Mockito.when(this.inventoryService.checkAvailableStock()).thenReturn(-1);
    //Mockito.when(this.inventoryService.deductStock()).thenReturn(true);
    //Mockito.when(this.paymentService.pay()).thenReturn(true);
    
    OrderService os = new OrderService(this.paymentService, this.inventoryService);

    assertThrows(IllegalStateException.class, () -> os.order());

    verify(this.inventoryService, Mockito.times(1)).checkAvailableStock();
    verify(this.inventoryService, Mockito.times(0)).deductStock();
    verify(this.paymentService, Mockito.times(0)).pay();
  }

}
