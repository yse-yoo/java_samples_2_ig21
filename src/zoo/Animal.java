package zoo;

//スーパークラス
public class Animal implements IAnimal {
	
	public Animal(String name) {
		super();
		this.name = name;
	}

	public String type;
	public String name;
	public String crying;

	public void walk() {
		System.out.println(this.name + "が歩いた");
	}
	
	public void cry() {
		System.out.println(this.crying);
	}

	public void escape() {
		System.out.println(this.name + "が逃げた");
	}

	@Override
	public void eat(String something) {
		System.out.println(this.name + "が" + something + "を食べている");
	}
	
}
