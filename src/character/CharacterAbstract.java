package character;

import monster.Monster;

public abstract class CharacterAbstract {

	//抽象メソッド
	public abstract int attack(Monster monster);
	
	public abstract boolean isAlive();

	public abstract void magic(Monster monster, String key);
}
