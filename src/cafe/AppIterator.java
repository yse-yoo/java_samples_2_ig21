package cafe;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;

public class AppIterator {

    public static void main(String[] args) {
        ArrayList<Drink> drinkList = new ArrayList<>();
        drinkList.add(new Drink("コーヒー", 350));
        drinkList.add(new Drink("紅茶", 400));
        drinkList.add(new Drink("ほうじ茶", 300));

        // イテレーター
        System.out.println("--- iterator ---");
        Iterator<Drink> iterator = drinkList.iterator();
        while (iterator.hasNext()) {
            Drink drink = iterator.next();
            System.out.println(drink.name);
            System.out.println(drink.price);
//			System.out.println(iterator.next().name);
//			System.out.println(iterator.next().price);
        }

        System.out.println("--- list iterator ---");
        ListIterator<Drink> listIterator = drinkList.listIterator();
        listIterator.add(new Drink("カフェモカ", 350));
        listIterator.previous();

        while (listIterator.hasNext()) {
            Drink drink = listIterator.next();
            System.out.println(drink.name);
        }

        // 曜日
        Map<Integer, String> weekdays = new HashMap<>();
        weekdays.put(Calendar.SUNDAY, "日");
        weekdays.put(Calendar.MONDAY, "月");
        weekdays.put(Calendar.TUESDAY, "火");
        weekdays.put(Calendar.WEDNESDAY, "水");
        weekdays.put(Calendar.THURSDAY, "木");
        weekdays.put(Calendar.FRIDAY, "金");
        weekdays.put(Calendar.SATURDAY, "土");

        Iterator<Integer> weekKeyIterator = weekdays.keySet().iterator();
        while (weekKeyIterator.hasNext()) {
            Integer key = weekKeyIterator.next();
            String weekday = weekdays.get(key);
            System.out.println(weekday);
            if (key == 1 || key == 7) {
                System.out.println("休み");
            } else {
                System.out.println("登校日");
            }
        }

        // 問題1
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(76);
        scores.add(81);
        scores.add(92);
        scores.add(56);
        scores.add(73);

        System.out.println("--- Q1 ---");
        Integer sum = 0;
        for (Integer value : scores) {
            sum += value;
        }
        System.out.println(sum);

        sum = 0;
        Iterator<Integer> scoreIterator = scores.iterator();
        while (scoreIterator.hasNext()) {
            Integer value = (Integer) scoreIterator.next();
            sum += value;
        }
        System.out.println(sum);

        // 問題2
        System.out.println("--- Q2 ---");
        Map<String, String> cityMap = new HashMap<>();
        cityMap.put("tokyo", "東京");
        cityMap.put("osaka", "大阪");
        cityMap.put("yokohama", "横浜");
        
        for (String key : cityMap.keySet()) {
           System.out.println(key); 
        }

        Iterator<String> keyCityIterator = cityMap.keySet().iterator();
        while (keyCityIterator.hasNext()) {
            String key = (String) keyCityIterator.next();
            System.out.println(key);
        }
    }

}
