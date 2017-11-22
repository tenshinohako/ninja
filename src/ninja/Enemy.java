package ninja;

public class Enemy {
	private String name;
	private int hp;

	public Enemy(String name, int hp) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.name = name;
		this.hp = hp;
	}

	public void attack(Ninja ninja) {
		ninja.setHp(ninja.getHp() - (20 - ninja.getArmour().getDefence()));
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

	public String getName() {
		return name;
	}

	public int getHp() {
		return hp;
	}
}
