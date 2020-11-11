// 2020-11-11 수 3교시 강의 - abstract
package step9_01.OOP_Theory;

// 일반클래스
class Parent1 {
	void test() {
		
	}
}

// 일반클래스를 상속받은 일반클래스
class Child1 extends Parent1 {
	
}

// 추상클래스 - form, model / 뼈대제공 
abstract class Parent2 { 	// 1) abstract 키워드를 클래스 앞에 붙여준다. 
	
	abstract void test1();	// 2) 추상메서드 : abstract 키워드를 메서드 앞에 붙여준다. 
	abstract void test2();	// 	  추상클래스는 선언만 하고 실질적인 구현은 
	abstract void test3();	// 	  추상클래스를 상속받은 자녀클래스에서 진행한다. 
							// 3) 메서드 뒤에 {}가 아닌 ;을 붙인다. 기능구현 x
	abstract void test4();
	abstract void test5();
	
	void test90() {}		// 일반메서드 있을 수 있음.
	void test91() {}
	int nVar;				// 일반변수 
	
}

// 추상클래스를 상속받은 일반클래스
class Child2 extends Parent2 {

	@Override
	void test1() {
	}

	@Override
	void test2() {
	}

	@Override
	void test3() {
	}

	@Override
	void test4() {
	}

	@Override
	void test5() {
	}
	
}

public class OOPEx06 {

	public static void main(String[] args) {
		
		new Parent1();
		new Child1();
		new Child2();
//		new Parent2();		// 추상클래스는 객체를 생성할 수 없다. 

	}

}
