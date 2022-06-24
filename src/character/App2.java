package character;

import java.util.ArrayList;

public class App2 {

	public static void main(String[] args) {
		// ArrayList
		ArrayList<Character> characterList = new ArrayList<>();
		
		// CRUD
		// Create: add()
		characterList.add(new Wizard("アリス"));
		characterList.add(new Wizard("テリー"));
		characterList.add(new Warrior("ボブ"));
		
		// Read
		for (Character character : characterList) {
			System.out.println(character.name);
			System.out.println(character.job);
		}

		//データの個数 size()
		int dataCount = characterList.size();
		System.out.println(dataCount);
		
		// Read：データをインデックスで取得 get()
		Character selectCharacter = characterList.get(1);
		System.out.println(selectCharacter.name);

		
	}

}
