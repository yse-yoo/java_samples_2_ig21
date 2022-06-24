package zoo;

//サブクラス
public class Dog extends Animal {

	//コンストラクタ
	public Dog(String name) {
		super(name);
		this.crying = "わん！";
	}
	
	//アノテーション
	@Override
	public void walk() {
		System.out.println(this.name + "が楽しそうに歩いた");
	}

	public void actionCollective() {
		System.out.println("集団行動");
	}
}
