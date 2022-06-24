package character;

import monster.Monster;

public class Warrior extends Character {

	//コンストラクタ
	public Warrior(String name) {
		super(name);
		this.job = "warrior";
		this.hp = 30;
		this.mp = 0;
		this.attackPower = 10;
		this.defencePower = 5;
	}

	//オーバーライド（上書き）
	@Override
	public int attack(Monster monster) {
		System.out.println("オーバーライド");
		return 0;
	}

}
