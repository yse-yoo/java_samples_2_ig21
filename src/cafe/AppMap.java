package cafe;

import java.util.HashMap;
import java.util.Map;

public class AppMap {

	public static void main(String[] args) {
        Map<String, Drink> drinkMap = new HashMap<>(); 
        drinkMap.put("D0001", new Drink("コーヒー", 350));
        drinkMap.put("D0002", new Drink("紅茶", 400));
        drinkMap.put("D0003", new Drink("ほうじ茶", 300));
        
        // key
        for (String key : drinkMap.keySet()) {
        	System.out.println(key);
		}

        // value
        for (Drink drink : drinkMap.values()) {
        	System.out.println(drink.name);
		}

        System.out.println("---- select drink ----");
        Drink selectDrink = drinkMap.get("D0001");
        System.out.println(selectDrink.name);
        System.out.println(selectDrink.price);
        

        System.out.println("---- count ----");
        int count = drinkMap.size();
        System.out.println(count);

	}

}
