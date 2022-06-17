package monster;

public class Monster {

	public String name;
	public int hp;
	public int mp;
	public int attackPower;
	public int defencePower;

	//コンストラクタ
	public Monster() {
		this.name = "ゴースト";
		this.hp = 5;
		this.mp = 0;
		this.attackPower = 2;
		this.defencePower = 1;
	}
	
	public boolean isAlive() {
		return (this.hp > 0);
	}
}
