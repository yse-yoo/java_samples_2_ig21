package character;

import item.Item;
import monster.Monster;

//スーパークラス
public class Character implements ICharacter{
	
	//コンストラクタ
	public Character(String name) {
		super();
		this.name = name;
		this.level = 1;
		this.exp = 0;
	}

	//フィールド（プロパティ）
	private String name;
	private String job;
	private int hp;
	private int mp;
	private int level;
	private int exp;
	private int attackPower;
	private int defencePower;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
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

	//インスタンスメソッド
	@Override
	public int attack(Monster monster) {
		int damage = this.attackPower - monster.defencePower;
		if (damage > 0) monster.hp -= damage;
		return damage;
	}

	public void greet(String message) {
		System.out.println(message);
	}
	
	public void showStatus() {
		System.out.println("---- Status ----");
		System.out.println("Name: " + this.name);
		System.out.println("Job: " + this.job);
		System.out.println("HP: " + this.hp);
		System.out.println("MP: " + this.mp);
		System.out.println("Lv: " + this.level);
		System.out.println("Exp: " + this.exp);
		System.out.println("Attack: " + this.attackPower);
		System.out.println("Defenece: " + this.defencePower);
		System.out.println("--------");
	}

	@Override
	public boolean isAlive() {
		return (hp > 0);
	}

	@Override
	public void magic(Monster monster, String key) {
		
	}

	@Override
	public void equip(Item item) {
		this.attackPower += item.getAttackPower();
		this.defencePower += item.getDefencePower();
	}

}
