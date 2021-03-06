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
		System.out.println("--- list ---");
		for (Character character : characterList) {
			System.out.println(character.getName());
			System.out.println(character.getJob());
		}

		//データの個数 size()
		int dataCount = characterList.size();
		System.out.println("--- size() ---");
		System.out.println(dataCount);
		
		// Read：データをインデックスで取得 get()
		Character selectCharacter = characterList.get(1);
		System.out.println(selectCharacter.getName());

		
		// Update: データをインデックスで指定して更新 set()
		characterList.set(0, new Warrior("スミス"));
		System.out.println("--- set() ---");
//		showData(characterList);
		for (Character character : characterList) {
			System.out.println(character.getName());
			System.out.println(character.getJob());
		}	
		
		// Delete(Destroy): 指定したインデックスで削除 remove()
		int lastIndex = dataCount - 1;
		characterList.remove(lastIndex);
		System.out.println("--- remove() ---");
		for (Character character : characterList) {
			System.out.println(character.getName());
			System.out.println(character.getJob());
		}	

		// Delete: すべて削除
		characterList.clear();
		System.out.println(characterList.size());
		
	}
	
	public static void showData(ArrayList<Character> characterList) {
		for (Character character : characterList) {
			System.out.println(character.getName());
			System.out.println(character.getJob());
		}	
	}

}
