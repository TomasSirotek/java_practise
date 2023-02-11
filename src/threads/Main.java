package threads;

import threads.model.AppModel;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Main {

    private static final Executor executor = Executors.newFixedThreadPool(6);

    private AppModel appModel = new AppModel();
    public static void main(String[] args) {
        for (int i = 0; i < 30 ; i++) {
            int taskIndex = i;

            executor.execute(() -> {
                System.out.println("TASK: " + taskIndex + "STARTED");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                System.out.println("TASK: " + taskIndex + "ENDED");

            });
        }
    }
}
