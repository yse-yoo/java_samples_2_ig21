package character;

import item.Item;
import monster.Monster;

public interface ICharacter {

	public int attack(Monster monster);
	public boolean isAlive();
	public void magic(Monster monster, String key);
	public void equip(Item item);

}
