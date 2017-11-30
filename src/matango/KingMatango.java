package matango;

import java.util.Random;

public class KingMatango extends Matango{
	private String name;
	private int hp;
	private int initialHp;
	private Matango[] child = new Matango[10];
	private int numOfChild = 0;

	public KingMatango(String name, int hp) {
		// TODO 自動生成されたコンストラクター・スタブ
		super(hp, 'k');
		this.name = name;
		this.hp = hp;
		this.initialHp = hp;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Matango spore() {
		Matango m = new Matango(hp / 2, (char)('0' + numOfChild));
		System.out.println("お化けキノコ" + (char)('0' + numOfChild) + "を生み出した");
		child[numOfChild] = m;
		numOfChild++;
		return m;
	}

	public void heal() {
		this.hp = this.initialHp;
		System.out.println(this.name + "は傷を癒した");
	}

	@Override
	public void run() {
		System.out.println(this.name + "は逃げ出した！");
	}

	@Override
	public void attack(Hero h) {
		switch(new Random().nextInt(3)) {
		case 0:
			if(numOfChild < 10) {
				this.spore();
			}
			break;
		case 1:
			this.heal();
			break;
		case 2:
			for(int i=0; i<numOfChild; i++) {
				child[i].attack(h);
			}
			System.out.println(this.name + "の攻撃");
			h.addHp(-10);
			System.out.println("10ポイントのダメージを与えた！");
			break;
		}
	}

}
