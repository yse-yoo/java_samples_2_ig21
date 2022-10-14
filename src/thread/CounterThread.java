package thread;

public class CounterThread implements Runnable {

    public static Integer count = 5;
    public long ms = 1000;

    @Override
    public void run() {
        synchronized (count) {
            while (count > 0) {
                try {
                    Thread.sleep(ms);
                    System.out.println(Thread.currentThread().getName() + ":" + count);
                    count--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            count = 5;
            System.out.println("--- thread end ---");
        }
    }

}
