public enum OrderStatus {
  PAID(1), //
  READY_FOR_SHIP(2), //
  DELIVERING(3), //
  DELIVERED(4),
  ;

  private final int status;

  private OrderStatus(int status) {
    this.status = status;
  }

  public int getStatus() {
    return this.status;
  }

  public OrderStatus next() {
    if (this == OrderStatus.DELIVERED)
      return null;

    int newStatus = this.status + 1;
    for (OrderStatus orderStatus : OrderStatus.values()) {
      if (orderStatus.status == newStatus)
        return orderStatus;
    }

    return null;
  }

  public static void main(String[] args) {
    System.out.println(OrderStatus.PAID.next());
    System.out.println(OrderStatus.READY_FOR_SHIP.next());
    System.out.println(OrderStatus.DELIVERING.next());
    System.out.println(OrderStatus.DELIVERED.next());
  }
}
