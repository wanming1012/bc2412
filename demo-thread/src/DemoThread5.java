import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DemoThread5 {
  private Map<Integer, String> map;

  public DemoThread5() {
    this.map = new ConcurrentHashMap<>();
  }

  public void put(int key, String value) {
    this.map.put(key, value);
  }

  public long getSize() {
    return map.size();
  }

  public static void main(String[] args) {
    DemoThread5 task = new DemoThread5();
    Runnable addTask1 = () -> {
      for (int i = 0; i < 1000000; i++) {
        task.put(i, "A");
      }
    };

    Runnable addTask2 = () -> {
      for (int i = 1000000; i < 2000000; i++) {
        task.put(i, "A");
      }
    };

    Thread workerB = new Thread(addTask1);
    System.out.println(workerB.getState());
    workerB.start();
    System.out.println(workerB.getState());

    Thread workerC = new Thread(addTask2);
    workerC.start();

    try {
      System.out.println(workerB.getState());
      workerB.join();
      workerC.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println(workerB.getState());

    System.out.println(task.getSize());
  }
}
