public class DemoThread {

    // main thread (worker A)
    // another thread (worker B)
    public static void main(String[] args) throws Exception {
        int x = 3;
        x++;
        ++x;
        x += 1;
        System.out.println(x);

        // Create another thread
        // 1. Task, 2. Thread
        //Runnable sayHelloTask = () -> System.out.println("Hello!!!");
        StringBuilder sb = new StringBuilder();
        Runnable concatStringTask = () -> {
            for (int i = 0; i < 1000000; i++)
                sb.append("!");

            System.out.println("Worker Thread : " + sb.length());
        };
        //sayHelloTask.run(); // main thread

        Thread workerB = new Thread(concatStringTask);
        workerB.start(); // workerB thread

        Thread.sleep(1);
        System.out.println("Main Thread : " + sb.length());
        System.out.println("Program end.");
    }
}
