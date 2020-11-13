// 2020-11-13 금 1교시 강의 - HashMap 
package step9_01.OOP_Theory;
import java.util.HashMap;
/*
 *  # HashMap
 *    - 컬렉션 프레임워크. json과 비슷하다!
 *    - HashMap은 K(key)에 V(value)를 할당하는 방식으로 데이터가 저장되는 자료구조 
 *    - 순서대로 저장되는 구조가 아니다. key로 기억함. data는 수동적.
 */

class Person {
	String name;
	int age;
	
	void method() {}
}

public class OOPEx11 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		// HashMap<String, Integer> hmap = new HashMap<>(); 			// new 뒤쪽의 generic은 생략가능
		
		// put(key, value)	: HashMap의 key에 value를 할당				// ArrayList.add()
		// 					  존재하지 않는 key에 넣어주면 데이터가 입력되고 존재하는 key에 넣으면 수정됨.
		hmap.put("data1", 1000);
		hmap.put("data2", 2000);
		hmap.put("data3", 3000);
		System.out.println(hmap);	// {data3=3000, data2=2000, data1=1000}
		System.out.println("--------------------------------------");

		// size()			: HashMap의 데이터 개수를 반환 				// ArrayList.size()
		System.out.println(hmap.size());
		hmap.put("data1", 1111);
		System.out.println(hmap);	// {data3=3000, data2=2000, data1=1111}
		System.out.println("--------------------------------------");
		
		// get(key) 		: HashMap의 key에 할당된 value를 얻어옴		// ArrayList.get(idx)
		System.out.println(hmap.get("data1"));
		System.out.println(hmap.get("data2"));
		System.out.println(hmap.get("data3"));
		System.out.println(hmap.get("data4"));	// 없는 key 입력시 null반환 
		System.out.println("--------------------------------------");
		
		// keyset()			: HashMap의 key만 얻어옴. 배열아니고 map형태 반환됨.
		System.out.println(hmap.keySet());
		for (String key : hmap.keySet()) {
			System.out.println(key + " : " + hmap.get(key));
		}
		System.out.println("--------------------------------------");

		// remove(key)		: HashMap의 key에 해당되는 값을 제거		// ArrayList.remove()
		System.out.println(hmap);
		hmap.remove("data2");
		System.out.println(hmap);
		System.out.println("--------------------------------------");
		
		// clear() 			: HashMap의 모든 값을 제거			 		// ArrayList.clear()
		System.out.println(hmap);
		hmap.clear();
		System.out.println(hmap);
		System.out.println("======================================");
		
		HashMap<String, Person> pmap = new HashMap<String, Person>();
		pmap.put("person1", new Person());
		pmap.get("person1").name = "홍길동";
		pmap.get("person1").method();
	}
}
