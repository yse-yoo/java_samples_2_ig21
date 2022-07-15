package character;

//サブクラス
public class Wizard extends Character {
	
	//コンストラクタ
	public Wizard(String name) {
		//スーパークラスのコンストラクタを実行
		super(name);
		setJob("wizard");
		setHp(10);
		setMp(20);
		setAttackPower(3);
	}

}
