package step9_04.zombie;

abstract public class Unit{
	
	private int playerPosition;
	private int curHp;
	int maxHp;
	
	public Unit() {}
	
	public Unit(int playerPosition, int curHp, int maxHp) {
		this.playerPosition = playerPosition;
		this.curHp = curHp;
		this.maxHp = maxHp;
	}

	public int getPlayerPosition() {
		return playerPosition;
	}

	public void setPlayerPosition(int playerPosition) {
		this.playerPosition = playerPosition;
	}

	public int getCurHp() {
		return curHp;
	}

	public void setCurHp(int curHp) {
		this.curHp = curHp;
	}

	public int getMaxHp() {
		return maxHp;
	}

	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}

	public void move() {
		if (playerPosition <= 10) playerPosition++;
		System.out.println("오른쪽으로 이동. 현재 위치 : "+ playerPosition);
	}
	
	abstract void attack(Unit unit);
}