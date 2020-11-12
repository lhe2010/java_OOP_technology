// 2020-11-12 목 3교시 강의 - 다형성(Polymorphism)
package step9_01.OOP_Theory;

import java.util.Scanner;

/*
 * # 다형성 (polymorphism)
 */

abstract class PolyShape {
	public abstract void draw();
}

class PolyPoint extends PolyShape {
	@Override
	public void draw() {
		System.out.println("점을 그린다. ");
	}
}

class PolyLine extends PolyShape {
	@Override
	public void draw() {
		System.out.println("선을 그린다. ");
	}
}

class PolyCircle extends PolyShape {
	@Override
	public void draw() {
		System.out.println("원을 그린다. ");
	}	
}

class PolyRect extends PolyShape {
	@Override
	public void draw() {
		System.out.println("직사각형을 그린다. ");
	}	
}

class PolyTriangle extends PolyShape {
	@Override
	public void draw() {
		System.out.println("삼각형을 그린다. ");
	}	
}

public class OOPEx10 {

	public static void main(String[] args) {
		
		PolyShape[] shapes = { new PolyPoint(), new PolyLine(), new PolyCircle(), new PolyRect(), new PolyTriangle()};
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("원하는 작업을 선택하세요 : ");
		int selectMenu = scan.nextInt();
		
		shapes[selectMenu].draw();
		scan.close();
		
//		for (PolyShape polyShape : shapes) {
//			polyShape.draw();
//		}
	}
}
