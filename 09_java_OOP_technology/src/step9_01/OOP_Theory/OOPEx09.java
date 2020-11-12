// 2020-11-12 목 3교시 강의 - 상속 심화
package step9_01.OOP_Theory;

// 클래스 형변환

//		***** 부모클래스 변수형으로 받았을때 자식클래스만 가진 메서드 쓸수있나? -> 쓸수없다.
// 			ㄴ 	예를들어서, PolyCircle을 색칠하는 color()메서드가 있다고 치면 
//				PolyShape[]에 담을경우 Circle클래스에만 있는 color()메서드를 쓰지 못한다. 
// 				근데 그렇다고 부모클래스에 color()를 넣기에는 PolyPoint랑 PolyLine에는 필요가 없는데
//				그걸 부모에 넣어서 강제구현하게 해서라도 사용해야하나??? -> 놉! 설계를 다르게 해야하는경우다. 만능이아님!
//		***** 자식클래스에서 오버라이딩된 메서드가 호출되나? -> ㅇㅇㅇㅇ
//		***** 언제쓰나? 부모형 배열로 여러 자식 객체 한번에 담을 수 있다. ex.그림판 그리기 

// 부모클래스
class Base {}

// 자녀클래스
class Sub extends Base {
	void printSub() {
		System.out.println("자녀클래스에만 있는 메서드");
	}
}

public class OOPEx09 {

	public static void main(String[] args) {
		Base base = new Base();
		Sub sub = new Sub();
		
		/*
		 * base 변수는 new 할때 Base에 있는 내용만 생성된다
		 * 반면, sub변수는 new 할때 Base와 Sub의 내용이 둘다 생성된다.
		 * 결국 sub는 Base형태로 형변환이 가능하고, 
		 * base는 Sub형태로 형변환이 가능하다. 
		 */
		
		Base test1 = sub;
		//Sub test2 = base;
		
		// [참고] instaceOf : 형변환이 가능한지 확인하는 메서드
		if(sub instanceof Base) 	// 항상 기준은 왼쪽!
			System.out.println("형변환 가능1");
		else 
			System.out.println("형변환 불가능1");
		
		if(base instanceof Sub) 
			System.out.println("형변환 가능2");
		else 
			System.out.println("형변환 불가능2");
		
		sub.printSub();
//		test1.printSub();
	}
}
