package zoo;

//サブクラス
public class Cat extends Animal {

	//コンストラクタ
	public Cat(String name) {
		super(name);
		this.crying = "にゃー！";
	}

	public void actionSolo() {
		System.out.println("単独行動");
	}
}
