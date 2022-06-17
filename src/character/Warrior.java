package character;

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

}
