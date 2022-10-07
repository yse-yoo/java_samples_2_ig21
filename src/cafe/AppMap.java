package cafe;

import java.util.ArrayList;
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
        
        String selectFood = foodMap.get("F0002");
        System.out.println(selectFood);

        System.out.println("---- values ----");
        for (String foodName : foodMap.values()) {
        	System.out.println(foodName);
		}
        
        System.out.println("---- city map ----");
        Map<Integer, String> cityMap = new HashMap<>();
//        Map<Integer, String> cityMap = new LinkedHashMap<>();
//        Map<Integer, String> cityMap = new TreeMap<>();
        cityMap.put(13, "東京");
        cityMap.put(27, "大阪");
        cityMap.put(14, "神奈川");
        
        for (Integer key : cityMap.keySet()) {
        	System.out.println(key);
		}
	}


}
