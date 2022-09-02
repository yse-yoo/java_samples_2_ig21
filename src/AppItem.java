import java.util.ArrayList;

import item.Drink;

public class AppItem {

	public static void main(String[] args) {
		Drink drink1 = new Drink();
		drink1.setName("コーヒー");
		drink1.setPrice(-350);
		drink1.setStock(100);
		
		Drink drink2 = new Drink();
		drink2.setName("紅茶");
		drink2.setPrice(400);
		drink2.setStock(10);

		Drink drink3 = new Drink();
		drink3.setName("ほうじ茶");
		drink3.setPrice(300);
		drink3.setStock(50);
		
		ArrayList<Drink> drinkList = new ArrayList<>();
		drinkList.add(drink1);
		drinkList.add(drink2);
		drinkList.add(drink3);
		
		for (Drink drink : drinkList) {
			System.out.println(drink.getName());
			System.out.println(drink.getPrice());
		}
	}
}
