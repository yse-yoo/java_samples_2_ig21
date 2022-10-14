package thread;

public class AppCounter {

    public static void main(String[] args) {
        CounterThread counter = new CounterThread();
        Thread thread1 = new Thread(counter);
        Thread thread2 = new Thread(counter);
        thread1.setName("スレッド1");
        thread2.setName("スレッド2");
        
        thread1.start();
        thread2.start();

    }

}
