import java.util.ArrayList;

import item.Drink;

public class AppItem {

	public static void main(String[] args) {
		Drink drink1 = new Drink();
		drink1.name = "コーヒー";
		drink1.price = 350;
		drink1.stock = 100;
		
		Drink drink2 = new Drink();
		drink2.name = "紅茶";
		drink2.price = 400;
		drink2.stock = 10;

		Drink drink3 = new Drink();
		drink3.name = "ほうじ茶";
		drink3.price = 300;
		drink3.stock = 50;
		
		ArrayList<Drink> drinkList = new ArrayList<>();
		drinkList.add(drink1);
		drinkList.add(drink2);
		drinkList.add(drink3);
		
		for (Drink drink : drinkList) {
			System.out.println(drink.name);
		}
	}
}
