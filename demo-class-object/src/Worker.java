public class Worker {
  Supermarket supermarket;

  public Worker(Supermarket supermarket) {
    this.supermarket = supermarket;
  }

  public void moveIn(int numOfStock) {
    this.supermarket.adjustStock(numOfStock);
  }

  public void moveOut(int numOfStock) {
    this.supermarket.adjustStock(-numOfStock);
  }
}
