package character;

import java.util.ArrayList;

public class App2 {

	public static void main(String[] args) {
		// ArrayList
		ArrayList<Character> characterList = new ArrayList<>();
		
		// Create: add()
		characterList.add(new Wizard("アリス"));
		characterList.add(new Wizard("テリー"));
		characterList.add(new Warrior("ボブ"));
		
	}

}
