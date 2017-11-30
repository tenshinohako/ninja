package matango;

public class Matango {
	private int hp;
	private char suffix;

	public Matango(int hp, char suffix) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.hp = hp;
		this.suffix = suffix;
	}

	public void run() {
		System.out.println("お化けキノコ" + this.suffix + "は逃げ出した！");
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

	public void attack(Hero h) {
		System.out.println("お化けキノコ" + this.suffix + "の攻撃");
		h.addHp(-5);
		System.out.println("5ポイントのダメージを与えた！");
	}

}
