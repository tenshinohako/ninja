package ninja;

public class Armour {
	private String name;
	private int defence;

	public Armour(String name, int defence) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.name = name;
		this.defence = defence;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDefence(int defence) {
		this.defence = defence;
	}

	public String getName() {
		return name;
	}

	public int getDefence() {
		return defence;
	}
}
