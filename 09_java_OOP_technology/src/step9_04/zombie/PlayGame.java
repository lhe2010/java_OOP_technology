package step9_04.zombie;

import java.util.*;

public class PlayGame {

	static Scanner scan = new Scanner(System.in);
	static Random ran = new Random();
	
	void play() {
		
		Hero hero = new Hero(1, 200, 20, 3);
		Zombie zom = new Zombie(5, 100, 10);
		Boss boss = new Boss(9, 300, 20, 100);

		int curPlayerPosition = 1;
		int meetZombiePosition = PlayGame.ran.nextInt(8)+1;
		hero.setPlayerPosition(curPlayerPosition);
		
		while (true) {
			
			System.out.println("\n[msg]현재 위치 = " + curPlayerPosition);
			System.out.print("[1]앞으로 이동하기 [2]종료하기 :");
			int move = scan.nextInt();

			if (move == 1) {
				
				curPlayerPosition++;
				hero.setPlayerPosition(curPlayerPosition);

				if (hero.getPlayerPosition() == meetZombiePosition) {
					
					System.out.print("\n[msg]좀비를 만났습니다. 공격모드로 바뀝니다. ");
					while (true) {
						System.out.print("공격하기(1),포션마시기(2): ");
						int selectMenu = scan.nextInt();

						if (selectMenu == 1) {
							zom.attack(hero); 
							hero.attack(zom); 
						} else if (selectMenu == 2) {
							hero.recovery();
						}
						
						if (hero.getCurHp() <= 0) {
							System.out.println("\n[msg]Hero가 죽었습니다. 게임에서 졌습니다. ");
							break;
						}

						if (zom.getCurHp() <= 0) {
							System.out.println("\n[msg]좀비를 이겼습니다. 앞으로 이동할 수 있습니다.");
							break;
						}
					}
				}
				
				if (hero.getPlayerPosition() == 9) {

					System.out.println("\n[msg]보스를 만났습니다. 공격모드로 바뀝니다. ");
					
					while (true) {
						System.out.print("공격하기(1),포션마시기(2): ");
						int selectMenu = scan.nextInt();

						if (selectMenu == 1) {
							boss.attack(hero); // 보스의 이번턴 공격력 저장
							hero.attack(boss); // 나의 이번턴 공격력 저장
						}
						
						if (selectMenu == 2) {
							hero.recovery();
						}

						if (hero.getCurHp() <= 0) {
							System.out.println("\n[msg]Hero가 죽었습니다. 게임에서 졌습니다.” ");
							break;
						}
						
						if (boss.getCurHp() <= 0) {
							System.out.println("\n[msg]보스를 이겼습니다.");
							break;
						}

					}
					if (hero.getCurHp() <= 0) {
						break;
					}
				}
				if (hero.getPlayerPosition() == 10) {
					System.out.println("\n[msg]게임에서 승리했습니다. 종료합니다.");
					break;
				}

			} else if (move == 2) {
				System.out.println("\n[msg]종료합니다. 감사합니다.");
				scan.close();
				break;
			}

		}
	}

}
