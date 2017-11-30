package matango;

public class Hero {
	private int hp;

	public Hero(int hp) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.hp = hp;
	}

	public int getHp() {
		return this.hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public void addHp(int diff) {
		this.setHp(this.getHp() + diff);
	}
}
