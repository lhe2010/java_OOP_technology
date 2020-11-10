// 2020-11-10 화 1교시 강의 
package step9_01.OOP_Theory;
/*
 * # 메서드 오버라이딩 (method overriding)
 *  - 부모클래스로부터 상속받은 메서드를 재정의(overriding)하여 사용
 *  - 부모클래스로부터 상속받은 메서드의 이름은 그대로 사용하지만,
 *    명령어들을 바꾸어서 사용한다. 
 *    
 *  - 메서드 오버로딩 (중복정의, overloading)과 혼용되기 쉽다. 
 *    ㄴ 하나의 클래스에서 
 *  
 */

class Character2 {
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

class Wizard2 extends Character2{

	void levelUp() { // 메서드 오버라이딩
		this.level++;
		this.hp += 30;
		this.mana += 1000;
		this.attack += 100;
		ShowStatus();
	}
	
	void fireball() {	// Wizard2 클래스만의 메서드 추가 
		System.out.println("# fireball!");
	}
}

class Warrior2 extends Character2{
	void levelUp() { // 메서드 오버라이딩
		this.level++;
		this.hp += 1000;
		this.mana += 30;
		this.attack += 500;
		ShowStatus();
	}
	
	void dash() {	// warrior 클래스만의 메서드 추가 
		System.out.println("# dash!");
	}
	
}

public class OOPEx04 {

	public static void main(String[] args) {

		Character2 c1 = new Character2();
		c1.ShowStatus();
		c1.levelUp();
		c1.levelUp();

		System.out.println("==============================");
		Warrior2 war2 = new Warrior2();
		war2.ShowStatus();
		war2.levelUp();
		war2.levelUp();
		
		war2.dash();		// warrior만의 메서드

		System.out.println("==============================");
		Wizard2 wiz2 = new Wizard2();
		wiz2.ShowStatus();
		wiz2.levelUp();
		wiz2.levelUp();
		
		wiz2.fireball();	// Wizard만의 메서드
	}
}
