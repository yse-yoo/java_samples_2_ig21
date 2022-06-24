package character;

public class Battle {

	public static void main(String[] args) {
		Wizard wizard1 = new Wizard("アリス");
		Wizard wizard2 = new Wizard("テリー");
		Warrior warrior1 = new Warrior("テリー");
		
		Character[] characters = { wizard1, wizard2, warrior1 };
	}

}
