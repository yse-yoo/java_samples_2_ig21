package character;

//サブクラス
public class Wizard extends Character {
	
	//コンストラクタ
	public Wizard(String name) {
		//スーパークラスのコンストラクタを実行
		super(name);
		this.job = "wizard";
		this.hp = 10;
		this.mp = 20;
		this.attackPower = 3;
		this.defencePower = 5;
	}

}
