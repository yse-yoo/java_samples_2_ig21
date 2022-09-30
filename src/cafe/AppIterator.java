package cafe;

import java.util.ArrayList;
import java.util.Iterator;

public class AppIterator {

	public static void main(String[] args) {
		ArrayList<Drink> drinkList = new ArrayList<>();
		drinkList.add(new Drink("コーヒー", 350));
		drinkList.add(new Drink("紅茶", 400));
		drinkList.add(new Drink("ほうじ茶", 300));

		//イテレーター
		Iterator<Drink> iterator = drinkList.iterator();

	}

}
