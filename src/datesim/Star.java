package datesim;

public class Star {
	private String name;
	private int hp;

	public Star(String name, int hp) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.name = name;
		this.hp = hp;
	}

	public int getFavorability(Opposite op) {
		return op.getStarFavorability();
	}

	public int getHP() {
		return hp;
	}

	public void takeARest() {
		this.hp += 10;
	}

	public void plusHP(int delta) {
		this.hp += delta;
	}

}
