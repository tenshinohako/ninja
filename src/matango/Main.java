package matango;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		KingMatango king = new KingMatango("king", 100);
		Hero hero = new Hero(100);

		while(hero.getHp() > 0) {
			king.attack(hero);
		}
	}

}
