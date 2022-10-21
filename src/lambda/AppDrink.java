package lambda;

import java.util.ArrayList;

import cafe.Drink;

public class AppDrink {

    public static void main(String[] args) {
        ArrayList<Drink> drinkList = new ArrayList<>();
        drinkList.add(new Drink("コーヒー", 350));
        drinkList.add(new Drink("紅茶", 400));
        drinkList.add(new Drink("ほうじ茶", 300));
        
        drinkList.forEach((drink) -> System.out.println(drink.name));
        
        for (Drink drink : drinkList) {
           System.out.println(drink.name); 
        }

        drinkList.forEach((drink) -> {
            System.out.println(drink.name);
            System.out.println(drink.price);
        });
    
    }

}
