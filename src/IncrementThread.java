import java.util.concurrent.TimeUnit;

public class IncrementThread {
    private static int count;

    public static void main(String[] args) throws InterruptedException {
        Thread backgroundThread = new Thread(()->{
            for (int i = 0; i < 10000000; i++) {
                ++count;
            }
        });
        backgroundThread.start();

        for (int i = 0; i < 10000000; i++) {
            ++count;
        }
        TimeUnit.SECONDS.sleep(5);
        System.out.println(count);
    }
}
