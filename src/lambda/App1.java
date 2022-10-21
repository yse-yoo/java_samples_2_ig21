package lambda;

public class App1 {

    public static void main(String[] args) {
        Runnable runner = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello!!!!");
            }
        };
        runner.run();
    }

}