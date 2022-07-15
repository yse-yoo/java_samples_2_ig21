package character;

import java.util.Random;

import monster.Monster;

public class Warrior extends Character {

	//コンストラクタ
	public Warrior(String name) {
		super(name);
		setJob("warrior");
		setHp(30);
		setMp(0);
		setAttackPower(10);
		setDefencePower(5);
	}

	//オーバーライド（上書き）
	@Override
	public int attack(Monster monster) {
		System.out.println("オーバーライド");
		
		// 元の攻撃力を保存
		int attackPower = getAttackPower();

		// 1/5 の確率で攻撃力を２倍
		Random rand = new Random();
		int randomIndex = rand.nextInt(5);
		if (randomIndex == 0) {
			setAttackPower(getAttackPower() * 2);
		}

		//スーパークラスのattack() を実行
		int damage = super.attack(monster);

		//攻撃力を元に戻す
		setAttackPower(attackPower);
		
		return damage;
	}

}
