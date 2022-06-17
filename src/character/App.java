package character;

import monster.Monster;

public class App {

	public static void main(String[] args) {
		Wizard wizard = new Wizard("アリス");
		wizard.greet("こんにちは！");
		wizard.showStatus();
		
		Warrior warrior = new Warrior("ボブ");
		warrior.greet("どうも!");
		warrior.showStatus();
		
		//ボブがモンスターに攻撃する
		Monster monster = new Monster();
//		int damage = warrior.attack(monster);
		int damage = wizard.attack(monster);
		
		//モンスターが生きているか？確認
		System.out.println(monster.hp);
		if (monster.isAlive()) {
			System.out.println(monster.name + "に" + damage + "のダメージ！");
		} else {
			System.out.println(monster.name + "を倒した！");
		}
	}

}
