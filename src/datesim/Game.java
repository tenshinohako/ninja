package datesim;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Game {
	private static final int MORNING = 1;
	private static final int DAYTIME = 2;
	private static final int EVENING = 3;

	public static void main(String[] args) {
		int elapsedDays = 1;
		int time = MORNING;

		ArrayList<Opposite> oppositeList = new ArrayList<Opposite>();

		Star star = new Star("shujinkou", 100);
		oppositeList.add(new Opposite("あや"));
		oppositeList.add(new Opposite("いろは"));
		oppositeList.add(new Opposite("うづき"));

		while(true) {
			System.out.print(elapsedDays + "日目");
			switch(time) {
			case MORNING:
				System.out.print("朝");
				break;
			case DAYTIME:
				System.out.print("昼");
				break;
			case EVENING:
				System.out.print("夜");
				break;
			}
			System.out.println("	HP: " + star.getHP());
			System.out.println("1: 好感度を上げる");
			System.out.println("2: 休む");
			System.out.println("3: 好感度を見る");
			try {
				//入力のためのバッファ↓
				InputStreamReader is = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(is);
				//入力のためのバッファ↑
				//おまじないと思ったらOK

				/*
				 * try{
				 * 	やりたいこと
				 * }catch(){
				 * 	エラー処理
				 * }
				 * */

				String select = br.readLine();//キーボードからの入力を受け付ける

				if(select.equals("1")) {
					star.plusHP(-10);
					while(true) {
						for(int i=0; i<oppositeList.size(); i++) {
							System.out.println(i+1 +": "+ oppositeList.get(i).getName());
						}
						select = br.readLine();
						try {
							int opSel = Integer.parseInt(select);
							if(0 < opSel && opSel <= oppositeList.size()) {
								for(int i=0; i<oppositeList.size(); i++) {
									if(i == opSel - 1) {
										oppositeList.get(i).plusStarFavorability(4);
										System.out.println(
												oppositeList.get(i).getName() +
												"の好感度が上がった");
									}else {
										oppositeList.get(i).plusStarFavorability(-1);
									}
								}
							}else {
								continue;
							}
						}catch(NumberFormatException e){
							continue;
						}

						break;
					}
				}else if(select.equals("2")){
					star.takeARest();
					System.out.println("回復した");
				}else if(select.equals("3")) {
					for(int i=0; i<oppositeList.size(); i++) {
						System.out.println(oppositeList.get(i).getName() +
								": " + star.getFavorability(oppositeList.get(i)));
					}
				}else {
					continue;
				}

				int date = elapsedDays % 9;
				Random rnd = new Random();
				if(date == rnd.nextInt(9)) {
					while(true) {
						System.out.println("告白する");
						for(int i=0; i<oppositeList.size(); i++) {
							System.out.println(i+1 +": "+ oppositeList.get(i).getName());
						}
						select = br.readLine();
						try {
							int opSel = Integer.parseInt(select);
							if(0 < opSel && opSel <= oppositeList.size()) {
								System.out.println(oppositeList.get(opSel - 1).getName() +
										"に告白");
								if(star.getFavorability(oppositeList.get(opSel - 1)) >= 30) {
									oppositeList.get(opSel - 1).plusStarFavorability(10);
									System.out.println("成功した");
								}else {
									oppositeList.get(opSel - 1).plusStarFavorability(-10);
									System.out.println("失敗した");
								}
							}
						}catch(NumberFormatException e) {
							continue;
						}
						break;
					}
				}

			}catch(IOException e){

			}

			if(star.getHP() <= 0) {
				System.out.println("Game Over");
			}



			if(time == EVENING) {
				time = MORNING;
				elapsedDays++;
			}else {
				time++;
			}


			try {
				TimeUnit.SECONDS.sleep(1);
			}catch(InterruptedException e) {

			}
		}
	}

}