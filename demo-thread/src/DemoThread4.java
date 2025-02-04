import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class DemoThread4 {
  private List<Integer> integers = new Vector<>();

  public void addInt(int x) {
    integers.add(x);
  }

  public int getSize() {
    return integers.size();
  }

  public static void main(String[] args) {
    DemoThread4 central = new DemoThread4();
    Runnable addTask = () -> {
      for (int i = 0; i < 1000000; i++) {
        central.addInt(i);
        //System.out.println("i=" + i + ", size=" + central.getSize());
      }
    };

    Thread workerB = new Thread(addTask);
    workerB.start();

    Thread workerC = new Thread(addTask);
    workerC.start();

    try {
      workerB.join();
      workerC.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println(central.getSize());
  }
}
