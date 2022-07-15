package character;

import monster.Monster;

public interface ICharacter {

	public int attack(Monster monster);
	public boolean isAlive();
	public void magic(Monster monster, String key);
	
}
