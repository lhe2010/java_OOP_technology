package step9_04.zombie;

public class Zombie extends Unit {
	
	int damage;
	
	public Zombie(int position, int curHp, int maxHp) {
		super(position,curHp,maxHp);
	}
	
	public void attack(Unit hero) {
		
		damage = PlayGame.ran.nextInt(maxHp)+1;
		
		hero.setCurHp(hero.getCurHp()-damage);
		if (hero.getCurHp() <= 0) 
			hero.setCurHp(0);
		
		this.setCurHp(this.getCurHp()+damage/2);
		
		System.out.println("좀비가 "+ damage + "의 공격력으로 공격 :"
				+ " 현재 Hero hp : "+ hero.getCurHp()+",좀비 체력 회복 " + this.getCurHp()); 
		
	}

}