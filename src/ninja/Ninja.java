package ninja;

public class Ninja {
	private String name;
	private int hp;
	private int agility;
	private Sword sword;
	private Armour armour;

	public Ninja(String name, int hp, int agility) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.name = name;
		this.hp = hp;
		this.agility = agility;
	}

	public void attack(Enemy enemy) {
		enemy.setHp(enemy.getHp() - sword.getDamage() * (agility / 10));
	}

	public void ninjutsu(Enemy enemy) {
		enemy.setHp(enemy.getHp() - (getHp() / 5) * (agility / 10));
	}

	public boolean isDead() {
		if(hp > 0) {
			return false;
		}else {
			return true;
		}
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHp(int hp) {
		if(hp > 0) {
			this.hp = hp;
		}else {
			this.hp = 0;
		}
	}

	public void setAgility(int agility) {
		this.agility = agility;
	}

	public void setSword(Sword sword) {
		this.sword = sword;
	}

	public void setArmour(Armour armour) {
		this.armour = armour;
	}

	public String getName() {
		return name;
	}

	public int getHp() {
		return hp;
	}

	public int getAgility() {
		return agility;
	}

	public Sword getSword() {
		return sword;
	}

	public Armour getArmour() {
		return armour;
	}
}
