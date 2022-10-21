package lambda;

public class AppRun {

    public static void main(String[] args) {
        Runnable runner = () -> System.out.println("Hello!!!");
        runner.run();

        hello(() -> showMessage("Hello!!!"));
        hello(() -> calculate(250, 7));

        Runnable calculateRunner = () -> calculate(350, 7);
        hello(calculateRunner);
    }
    
    public static void showMessage(String message) {
        System.out.println(message);
    }

    public static void calculate(Integer price, Integer amount) {
        Integer totalPrice = price * amount;
        System.out.println(totalPrice);
    }

    public static void hello(Runnable runner) {
       System.out.println("start");
       runner.run(); 
       System.out.println("end");
    }
}
