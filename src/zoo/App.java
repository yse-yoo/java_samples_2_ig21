package zoo;

public class App {

	public static void main(String[] args) {
		Dog dog = new Dog("タロー");
		dog.walk();
		dog.cry();
		dog.actionCollective();
		
		Cat cat = new Cat("ミケ");
		cat.walk();
		cat.cry();
		cat.actionSolo();
		
		Dog dog1 = new Dog("タロー");
		Dog dog2 = new Dog("ジョン");
		Cat cat1 = new Cat("ミケ");
		Cat cat2 = new Cat("キャサリン");
		// 動物をまとめて walk() させる
	}

}
