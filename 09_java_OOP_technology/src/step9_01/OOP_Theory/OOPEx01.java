// 2020-11-09 월 1교시 강의
package step9_01.OOP_Theory;

// # 싱글턴 패턴 : 객체를 딱 한번만 생성하고 싶을때 사용하는 기법
class MySingleTon {
	// 1) private 기본 생성자를 만든다
	private MySingleTon() {}
	// 2) 외부에서 자기자신을 static으로 인스턴스를 생성한다. 
	private static MySingleTon instance = new MySingleTon();
	// 3) 자기 자신을 반환할 getter를 만들어준다. 
	public static MySingleTon getInstance() { // static 메소드. 클래스명.메소드()로 사용. 
		return instance;
	}
	
	// 테스트할 용도의 멤버변수
	int nVar1; 
	int nVar2;
	int nVar3;
	
	// 테스트할 용도의 메서드 
	void method1() {}
	void method2() {}
	void method3() {}
}

public class OOPEx01 {

	public static void main(String[] args) {
		
//		MySingleTon test = new MySingleTon();	// 원래 방법. 에러남.
		MySingleTon.getInstance();				// 싱글턴 사용법
		
		System.out.println(MySingleTon.getInstance().nVar1);
		System.out.println(MySingleTon.getInstance().nVar2);
		System.out.println(MySingleTon.getInstance().nVar3);
		
		MySingleTon.getInstance().method1();
		MySingleTon.getInstance().method2();
		MySingleTon.getInstance().method3();
		
		//////// 생각해볼부분 ////////
		MySingleTon temp = MySingleTon.getInstance(); 	// temp변수로 짧게 사용가능
		System.out.println(temp);						// 참조 주소가 같다. 
//		System.out.println(MySingleTon.getInstance());

		System.out.println(++temp.nVar1);
		System.out.println(temp.nVar1);
		temp.method1();
	}

}
