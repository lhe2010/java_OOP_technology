package step9_04.zombie;

public class Hero extends Unit {
	
	int damage;
	int recoveryCount;
	
	public Hero(int playerPosition, int curHp, int maxHp, int recoveryCount) {
		super(playerPosition, curHp, maxHp);
		this.recoveryCount = recoveryCount;
	}

	public void attack(Unit enemy) {
		if (enemy instanceof Boss) {	//보스인지 아닌지 구분해서 공격
			
			Boss boss = (Boss)enemy;
			damage = PlayGame.ran.nextInt(maxHp) + 1;
			
			if (boss.getShield() > 0) {  
				int tempBossShield = boss.getShield() - damage;
				System.out.println("tempBossShiled : " + tempBossShield);
				if (tempBossShield >= 0) {  // 10 , 16
					 boss.setShield(boss.getShield()- damage);
				} else {
					boss.setShield(0);
					boss.setCurHp(boss.getCurHp() + tempBossShield);
				}
			} else {
				boss.setCurHp(boss.getCurHp() - damage);
			}
			
			if (boss.getCurHp() <= 0) {
				boss.setCurHp(0);
			}
			System.out.println("\n[msg]히어로가 " + damage + "의 공격력으로 공격 :" + " 현재 Boss hp : " + boss.getCurHp() + "현재 Boss Shield : " + boss.getShield());
		} else {
			damage = PlayGame.ran.nextInt(maxHp) + 1;
			enemy.setCurHp(enemy.getCurHp() - damage);
			
			if (enemy.getCurHp() <= 0) 
				enemy.setCurHp(0);
			System.out.println("\n[msg]히어로가 " + damage + "의 공격력으로 공격 :" + " 현재 Zombie hp : " + enemy.getCurHp());
		}
	}
	public void recovery() {
		if (recoveryCount > 0) {
			setCurHp(getCurHp() + 100);
			System.out.println("\n[msg]체력 회복해서" + getCurHp() + "이 되었습니다");
			recoveryCount--;
		} else if (recoveryCount == 0) {
			System.out.println("\n[msg]모두 사용했습니다.");
		}
	}
}
