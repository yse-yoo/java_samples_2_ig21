package item;

public class Item implements IItem {

	private String name;
	private String type;
	private int attackPower;
	private int defencePower;
	private int healPoint;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getAttackPower() {
		return attackPower;
	}
	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}
	public int getDefencePower() {
		return defencePower;
	}
	public void setDefencePower(int defencePower) {
		this.defencePower = defencePower;
	}
	public int getHealPoint() {
		return healPoint;
	}
	public void setHealPoint(int healPoint) {
		this.healPoint = healPoint;
	}
	
	
}
