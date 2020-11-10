// 2020-11-10 화 1교시 강의 
package step9_01.OOP_Theory;
/*
 *  # 상속
 *  
 *   - 클래스간의 부모자식 관계를 설정해서 클래스를 광범위하게 사용가능
 *   - 단일 상속만 가능. (다중상속 불가)
 *     Ex) Class A Extends B, C, D, E (불가능)
 *   - 부모/상위/슈퍼/기반 클래스 , 자식/하위/서브/파생 클래스
 *   - 모든 클래스는 Object 클래스를 상속받은 상태에서 시작한다. 
 *   - [형식]
 *   
 *   	class 자식클래스이름 extends 부모클래스이름 {
 *   
 *   	}
 */

class Character {
	int level 	= 1;
	int hp 		= 1;
	int mana 	= 1;
	int attack 	= 1;
	
	void levelUp() {
		this.level++;
		this.hp += 5;
		this.mana += 5;
		this.attack += 5;
		this.ShowStatus();
	}
	
	void ShowStatus() {
		System.out.printf("level: %d\n", this.level);
		System.out.printf("hp: %d\n", this.hp);
		System.out.printf("mana: %d\n", this.mana);
		System.out.printf("attack: %d\n\n", this.attack);
	}
}

class Wizard extends Character{
	
}

class Warrior extends Character{
	
}

public class OOPEx03 {

	public static void main(String[] args) {

		Character c1 = new Character();
		c1.ShowStatus();
		c1.levelUp();
		c1.levelUp();

		System.out.println("==============================");
		Warrior war1 = new Warrior();
		war1.ShowStatus();
		war1.levelUp();
		war1.levelUp();
		
		System.out.println("==============================");
		Wizard wiz1 = new Wizard();
		wiz1.ShowStatus();
		wiz1.levelUp();
		wiz1.levelUp();
	}
}
