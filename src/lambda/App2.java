package lambda;

public class App2 {
    public static Float TAX_RATE = 0.1f;

    public static void main(String[] args) {

        ICalculate calculate = new ICalculate() {
            @Override
            public Integer totalPrice(Integer price) {
                Float totalPrice = price * (1 + TAX_RATE);
                return totalPrice.intValue();
            }
        };

        Integer price = calculate.totalPrice(1000);
        System.out.println(price);

        price = calculate.totalPrice(2560);
        System.out.println(price);
    }


}
