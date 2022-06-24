package character;

import java.util.Random;

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
		
		// 元の攻撃力を保存
		int attackPower = this.attackPower;

		// 1/5 の確率で攻撃力を２倍
		Random rand = new Random();
		int randomIndex = rand.nextInt(5);
		if (randomIndex == 0) {
			this.attackPower *= 2;
		}

		//スーパークラスのattack() を実行
		int damage = super.attack(monster);

		//攻撃力を元に戻す
		this.attackPower = attackPower;
		
		return damage;
	}

}
