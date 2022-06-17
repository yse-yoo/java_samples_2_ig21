package zoo;

//サブクラス
public class Dog extends Animal {

	//コンストラクタ
	public Dog(String name) {
		super(name);
		this.crying = "わん！";
	}

	public void actionCollective() {
		System.out.println("集団行動");
	}
}
