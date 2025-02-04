import java.util.concurrent.atomic.AtomicInteger;

public class DemoThread2 {
  //private int x;
  private AtomicInteger x = new AtomicInteger(0);

  public int getX() {
    //return this.x;
    return x.get();
  }

  public void addOne() {
    //this.x++;
    this.x.getAndIncrement();
  }

  public static void main(String[] args) {
    DemoThread2 place = new DemoThread2();
    place.addOne();
    System.out.println(place.getX());

    DemoThread2 central = new DemoThread2();
    Runnable addTask = () -> {
      System.out.println("Thread ID : " + Thread.currentThread().getId());
      for (int i = 0; i < 1000000; i++)
        central.addOne();
    };

    System.out.println("Thread ID : " + Thread.currentThread().getId());

    Thread workerB = new Thread(addTask);
    workerB.start();
    System.out.println("Thread ID : " + workerB.getId());

    Thread workerC = new Thread(addTask);
    workerC.start();
    System.out.println("Thread ID : " + workerC.getId());

    try {
      workerB.join();
      workerC.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println(central.getX());
  }
}
