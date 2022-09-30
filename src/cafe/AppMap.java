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

        System.out.println("---- remove ----");
        drinkMap.remove("D0001");
        count = drinkMap.size();
        System.out.println(count);
        
        for (Drink drink : drinkMap.values()) {
        	System.out.println(drink.name);
		}

        System.out.println("---- foodMap ----");
        Map<String, String> foodMap = new HashMap<>();
        foodMap.put("F0001", "Apple");
        foodMap.put("F0002", "Peach");
        foodMap.put("F0003", "Grape");
        
        
	}

}
