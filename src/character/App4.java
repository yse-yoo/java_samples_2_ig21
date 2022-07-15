package character;

import item.Item;

public class App4 {

	public static void main(String[] args) {
		Wizard wizard = new Wizard("アリス");
		
		Item item  = new Item();
		item.setName("ブロンズナイフ");
		item.setAttackPower(5);
		item.setDefencePower(0);
		
		wizard.showStatus();

		wizard.equip(item);
		
		wizard.showStatus();

	}

}
