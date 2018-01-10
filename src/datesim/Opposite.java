package datesim;

public class Opposite {
	private String name;
	private int starFavorability = 0;

	public Opposite(String name) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.name = name;
	}

	public int getStarFavorability() {
		return starFavorability;
	}

	public void plusStarFavorability(int delta) {
		starFavorability += delta;
	}

	public String getName() {
		return name;
	}

}
