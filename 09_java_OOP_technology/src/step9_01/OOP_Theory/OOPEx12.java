// 2020-11-13 금 1교시 강의 - Generic
package step9_01.OOP_Theory;
/*
 *  # 제네릭
 *   - 클래스 내부에서 사용하는 데이터 타입을 클래스의 인스턴스를 생성할때 결정하는 것을 의미
 *   - 객체의 타입을 컴파일 시점에 체크하기 때문에 타입의 안정성을 높이고 형변환의 번거로움을 줄일 수 있다. 
 */

class MyVector<T> { 	// class명 옆에 <타입>을 쓴다. 대명사처럼. 쓸때 T에 받아온다. 
	Object arr[] = null;// Object는 모든 클래스의 조상
	int elementCnt = 0;
	
	void add(T data) {	// 넘겨주는게 다 T가 됨.
		if(elementCnt == 0) {
			arr = new Object[1];
		} else {
			Object[] temp = arr;
			arr = new Object[elementCnt+1];
			for (int i = 0; i < elementCnt; i++) {
				arr[i] = temp[i];				
			}
			temp = null;
		}
		arr[elementCnt++] = data;
	}
	
	T get(int index) {			// 리턴타입을 T로 해줘야함
		return (T) arr[index];	// 리턴값을 T로 형변환 해줘야함!!!!!!
	}
}

class Client {
	String name;
	void printName() {
		System.out.println(name);
	}
}


class Manager {
	String name;
	void printName() {
		System.out.println(name);
	}
}

class Supervisor {
	String name;
	void printName() {
		System.out.println(name);
	}
}

public class OOPEx12 {

	public static void main(String[] args) {
		
		MyVector<Client> clientList = new MyVector<>();
		MyVector<Manager> managerList = new MyVector<>();
		MyVector<Supervisor> supervisorList = new MyVector<>();
		
		Client client1 = new Client();
		client1.name = "Client1's name";
		clientList.add(client1);
		
		Manager manager1 = new Manager();
		manager1.name = "Manager1's name";
		managerList.add(manager1);
		
		Supervisor supervisor1 = new Supervisor();
		supervisor1.name = "Supervisor1's name";
		supervisorList.add(supervisor1);
		
		clientList.get(0).printName();
		managerList.get(0).printName();
		supervisorList.get(0).printName();

		System.out.println("--------------------------------------");
		System.out.println("--------------------------------------");

//		MyVector<Object> vector = new MyVector<>();
//		vector.add(client1);
//		vector.add(manager1);
//		vector.add(supervisor1);
//		for (int i = 0; i < args.length; i++) {
//			System.out.println(vector.get(i)); 
//			// Object에는 print가 없어서 .찍어도 print메소드가 안나옴. 
//			// 그럼 아예 세개 형태 모두의 부모로 만들면 가능한가??
//		}
		
		// client와 manager, supervisor 셋의 부모 Person 클래스를 제네릭으로 넣으면 가능! 
		// for문에 ((Person)vector2.get(i)).printName(); 
	}

}
