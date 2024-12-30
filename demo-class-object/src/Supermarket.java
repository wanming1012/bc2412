public class Supermarket {
  private int availableStock;

  public Supermarket(int availableStock) {
    this.availableStock = availableStock;
  }

  public int getAvailableStock() {
    return this.availableStock;
  }

  public void adjustStock(int numOfStock) {
    this.availableStock += numOfStock;
  }

  public static void main(String[] args) {
    Supermarket s1 = new Supermarket(0);
    Worker worker = new Worker(s1);
    worker.moveIn(10);
    worker.moveIn(13);
    worker.moveOut(4);
    System.out.println(s1.getAvailableStock());
  }
}
