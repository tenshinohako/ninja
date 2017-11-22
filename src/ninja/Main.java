package ninja;

public class Main {

	public static void main(String[] args) {
		Sword s = new Sword("真の剣", 10);
		Armour a = new Armour("くさりかたびら", 5);
		Ninja ninja = new Ninja("情報太郎", 100, 20);
		ninja.setArmour(a);
		ninja.setSword(s);
		Enemy enemy = new Enemy("おばけ", 100);

		boolean isAttackTurn = true;

		while(true) {
			if(isAttackTurn) {
				ninja.attack(enemy);
			}else {
				ninja.ninjutsu(enemy);
			}
			isAttackTurn = !isAttackTurn;
			if(enemy.isDead()) {
				System.out.println(enemy.getName() + "を倒した.");
				break;
			}

			enemy.attack(ninja);
			if(ninja.isDead()) {
				System.out.println(ninja.getName() + "は倒された.");
				break;
			}
		}
	}
}
