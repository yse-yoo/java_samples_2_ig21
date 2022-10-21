package lambda;

public class AppRun {

    public static void main(String[] args) {

        Runnable runner = () -> System.out.println("Hello!!!");
        runner.run();
    }

}
