package ninja;

public class Sword {
	private String name;
	private int damage;

	public Sword(String name, int damage) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.name = name;
		this.damage = damage;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public String getName() {
		return name;
	}

	public int getDamage() {
		return damage;
	}

}
