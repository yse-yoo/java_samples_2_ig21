package zoo;

//サブクラス
public class Cat extends Animal {

	//コンストラクタ
	public Cat(String name) {
		super(name);
		this.crying = "にゃー！";
	}

	@Override
	public void walk() {
		System.out.println(this.name + "が警戒して歩いた");
	}
	
	public void actionSolo() {
		System.out.println("単独行動");
	}
}
