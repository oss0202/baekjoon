import java.util.concurrent.TimeUnit;

public class IncrementThreadVol {
    private static int count = 0;

    public static void main(String[] args) throws InterruptedException {
        for (int tc = 0; tc < 1000; tc++) {
            Worker1 w1 = new Worker1();
            w1.start();
            Thread.sleep(100);
            w1.stop = true;
            System.out.println(tc + " : stop flag");
            w1.join();
        }
    }
}
