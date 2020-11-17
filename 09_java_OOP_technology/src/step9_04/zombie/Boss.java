package step9_04.zombie;

public class Boss extends Zombie {

	private int shield;
	
	public void setShield(int value) {
		shield = value;
	}
	
	public int getShield() {
		return shield;
	}
	
	
	public Boss(int position, int curHp, int maxHp, int shield) {
		super(position, curHp, maxHp);
		this.shield = shield;
	}

	
	public void attack(Unit hero) {

		int criticalProbability  = PlayGame.ran.nextInt(4);
		
		if (criticalProbability == 0) {
			System.out.println("\n[msg]보스의 필살기 발동 2배의 공격력");
			int damage = 2 * (PlayGame.ran.nextInt(maxHp) + 1);
			hero.setCurHp(hero.getCurHp() - damage);
			
			if (hero.getCurHp() <= 0) 
				hero.setCurHp(0);
			System.out.println("\n[msg]보스가 " + damage + "의 공격력으로 공격 :" + " 현재 Hero hp : " + hero.getCurHp());
		} 
		else {
			System.out.println("\n[msg]보스의 일반공격 ");
			int damage = PlayGame.ran.nextInt(maxHp) + 1;
			hero.setCurHp(hero.getCurHp() - damage);
			if (hero.getCurHp() <= 0) {
				hero.setCurHp(0);
			}
			System.out.println("\n[msg]보스가 " + damage + "의 공격력으로 공격 :" + " 현재 Hero hp : " + hero.getCurHp());
		}
	}
}