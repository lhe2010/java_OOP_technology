// 2020-11-11 수 3교시 강의 - interface
package step9_01.OOP_Theory;

abstract class AA{			// 추상클래스
	abstract void test1();	// 추상메서드
	void test2() {}			// 추상클래스는 일반 메서드도 같이 사용가능하다.
}

interface BB {				// 인터페이스 - 추상클래스처럼 틀이다. 더 강력함. 
	public abstract void test3();	// 
	void test4();
//	void test5() {}			// 인터페이스는 일반메서드를 사용할 수 없다. 
}

interface CC {
	abstract void test5();
	abstract void test6();
}

								// 인터페이스는 '구현한다'고 표현한다. 
class DD implements BB, CC {	// 인터페이스는 다중상속이 가능하다. 

	@Override
	public void test5() {
	}

	@Override
	public void test6() {
	}

	@Override
	public void test3() {
	}

	@Override
	public void test4() {
	}	
	
}
public class OOPEx07 {

	public static void main(String[] args) {

	}

}
