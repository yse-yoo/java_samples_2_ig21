package zoo;

public class App {

	public static void main(String[] args) {
		Dog dog = new Dog("タロー");
		dog.walk();
		dog.cry();
		
		Cat cat = new Cat("ミケ");
		cat.walk();
		cat.cry();
	}

}
