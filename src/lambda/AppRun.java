package lambda;

public class AppRun {

    public static void main(String[] args) {

        Runnable runner = () -> System.out.println("Hello!!!");
        runner.run();
        
    }
    
    public static void showMessage(String message) {
        System.out.println(message);
    }

    public static void hello(Runnable runner) {
       runner.run(); 
    }
}
