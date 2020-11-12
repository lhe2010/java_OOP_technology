// 2020-11-12 목 3교시 강의 - interface 심화 
package step9_01.OOP_Theory;

class Point {
	int x;
	int y;
	public void move() {}
}

//인터페이스는 정적(static)멤버변수(상수)와 추상메서드로만 구성된 특별한 형태이다. 
interface Draw {
	public static final double pi = 3.141592; // 정적멤버(static), 상수(final)
	// 인터페이스는 변수선언시 앞의 내용을 생략하면 public static final을 컴파일러가 자동으로 작성해줌
	int LIMIT = 100; 
	
	public abstract void move1(); 		// 추상메서드
	// 인터페이스는 메서드선언시 앞의 내용을 생략하면 public static final을 컴파일러가 자동으로 작성해줌
	void erase();						// 키워드 생략가능 

	// 하지만 키워드 생략하지말고 다 쓸것!
}

interface Graphic {
	public abstract void resize();
	public abstract void rotate();
}
// 클래스는 인터페이스를 상속받을 수 없다. 
// class Test extends Graphic {} // ERROR!
// 인터페이스는 클래스를 상속받을 수 없다. 
// interface Test extends Point{} // ERROR!
// 클래스는 클래스끼리, 인터페이스는 인터페이스끼리 상속시킬 수 있다. 
// 클래스는 다중상속을 허용하지 않지만, 인터페이스는 다중상속을 허용한다. 
// interface Test extends Graphic, Draw {}

// 클래스 상속과 인터페이스를 동시에 구현한 예시 
class Line extends Point implements Graphic {
	@Override
	public void resize() {
	}
	@Override
	public void rotate() {
	}
}

public class OOPEx08 {

	public static void main(String[] args) {
	}
}
