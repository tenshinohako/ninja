package ninja;

public class Main {

	public static void main(String[] args) {

		Sword s = new Sword("真の剣", 10);
		Armour a = new Armour("くさりかたびら", 5);
		Ninja ninja = new Ninja("情報太郎", 100, 20);
		ninja.setArmour(a);
		ninja.setSword(s);
		Enemy enemy = new Enemy("おばけ", 100);



		System.out.println("before fight  " + ninja.getHp() + " " + enemy.getHp());
		while(true) {
			ninja.attack(enemy);
			if(enemy.isDead()) {
				System.out.println(enemy.getName() + "を倒した.");
				break;
			}
			System.out.println("ninja attack  " + ninja.getHp() + " " + enemy.getHp());

			enemy.attack(ninja);
			if(ninja.isDead()) {
				System.out.println(ninja.getName() + "は倒された.");
				break;
			}
			System.out.println("enemy attack  " + ninja.getHp() + " " + enemy.getHp());

			ninja.ninjutsu(enemy);
			if(enemy.isDead()) {
				System.out.println(enemy.getName() + "を倒した.");
				break;
			}
			System.out.println("ninja ninjutsu" + ninja.getHp() + " " + enemy.getHp());

			enemy.attack(ninja);
			if(ninja.isDead()) {
				System.out.println(ninja.getName() + "は倒された.");
				break;
			}
			System.out.println("enemy attack  " + ninja.getHp() + " " + enemy.getHp());
		}
	}

}
