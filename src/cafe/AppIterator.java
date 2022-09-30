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

		//イテレーター
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

			if (key == 1 || key == 7) {
				System.out.println("休み");
			} else {
				System.out.println("登校日");
			}
		}
	}

}
