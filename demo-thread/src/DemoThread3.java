public class DemoThread3 {
  private String x = "";

  public String getX() {
    return this.x;
  }

  public synchronized void addA() {
    this.x += "A";
  }

  public static void main(String[] args) {
    DemoThread3 central = new DemoThread3();
    Runnable concatATask = () -> {
      for (int i = 0; i < 100000; i++) {
        central.addA();
      }
    };

    Thread workerB = new Thread(concatATask);
    workerB.start();

    Thread workerC = new Thread(concatATask);
    workerC.start();

    try {
      workerB.join();
      workerC.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println(central.getX().length());
  }
}
