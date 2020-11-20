// 2020-11-20 금 3교시 강의 - Thread
package step9_01.OOP_Theory;

/*
 *  # 쓰레드
 *   - 운영체제에 의해서 관리되는 하나의 '작업' 혹은 '태스크'를 의미
 *     ex) main()함수도 하나의 쓰레드
 *   - main() 이외의 다른 쓰레드를 만들려면
 *     Thread 클래스를 상속받거나 Runnable 인터페이스를 구현한다. 
 */

class Music extends Thread { // Thread 클래스를 상속받아서 사용할 수 있다. 
	
	boolean isPlayMusic = true;
	
	@Override				// Thread 클래스로부터 제공되는 run()메서드 오버라이딩 
	public void run() {		// 쓰레드가 실행할 명령어 기술 
		int i = 0;
		while(isPlayMusic) {
			System.out.println(++i + ": 배경 음악이 연주되는 중....");

			// 명령어를 딜레이 해주는 기능 
			// 1000 > 1초, 500 > 0.5초, 100 > 0.1초
			try { Thread.sleep(500); } catch (InterruptedException e) { e.printStackTrace(); } 
		}
	}
}

class Game extends Thread {
	
	boolean isPlayGame = true;
	
	@Override
	public void run() {
		int i = 0;
		while(isPlayGame) {
			System.out.println(++i + ": 신나게 게임 하는 중....");
			
			try { Thread.sleep(500); } catch (InterruptedException e) { e.printStackTrace(); } 
		}
	}
}
public class OOPEx15 {
	public static void main(String[] args) {
		
		Music musicPlay = new Music();
		Game gamePlay = new Game();
		
		musicPlay.start(); // 쓰레드를 시작하는 메서드, 쓰레드의 run()메서드를 호출
		gamePlay.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i + ": 신나게 카톡을 하는 중");
			try { Thread.sleep(700); } catch (InterruptedException e) { e.printStackTrace(); }
			
			if(i == 7) {
				System.out.println("앗 엄마다!!(현재 i = "+ i +")");
				System.out.println("엄마가 오셔서 게임과 음악을 종료합니다.");
				musicPlay.isPlayMusic = false;
				gamePlay.isPlayGame = false;
				break;
			}			
		}		
	}
}
