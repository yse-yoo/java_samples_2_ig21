package character;

public class Character {
	//フィールド（プロパティ）
	public String name;
	public String job;
	public int hp;
	public int mp;
	public int level;
	public int exp;
	public int attackPower;
	public int defencePower;

	//インスタンスメソッド
	public void greet(String message) {
		System.out.println(message);
	}
	
	public void showStatus() {
		System.out.println("Name: " + this.name);
	}
}
