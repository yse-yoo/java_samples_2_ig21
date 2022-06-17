package character;

public class App {

	public static void main(String[] args) {
		Wizard wizard = new Wizard("アリス");
		wizard.greet("こんにちは！");
		wizard.showStatus();
		
		Warrior warrior = new Warrior("ボブ");
		warrior.greet("どうも!");
		warrior.showStatus();
	}

}
