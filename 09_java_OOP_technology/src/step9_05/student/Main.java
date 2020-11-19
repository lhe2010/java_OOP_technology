// 2020-11-18 수 구조 설명, 실습 (**main에서 구현하는게 아닌게 포인트인데 main에서 구현함. 목요일에 수정할것!)
// 2020-11-19 목 1교시 15:20-15:50 삭제/수정 기능 구현
package step9_05.student;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Controller controller = new Controller();	
			
		while (true) {
			System.out.print("[1]추가 [2]수정 [3]삭제 [4]출력 [5]전체출력 [6]종료 : ");
			int selectMenu = scan.nextInt();
			
			if (selectMenu == 1) {
				
				System.out.print("아이디를 입력하세요 : ");
				String id = scan.next();
				
				System.out.print("번호를 입력하세요 : ");
				int num = scan.nextInt();
				
				System.out.print("이름을 입력하세요 : ");
				String name = scan.next();
				
				StudentInsert stInsert = controller.getInsert();
				// 컨트롤러에서 insert를 가져온다는 건 controller에 StudentInsert가져오는것. 
				stInsert.insert(new StudentVO(id , num , name));
				
			} else if (selectMenu == 2) {
				// 수정 : 아이디를 입력받아서 해당되는 아이디가 있으면
				// 이름과 번호를 변경할 수 있는 기능
				System.out.print("아이디를 입력하세요 : ");
				String id = scan.next();
				
				StudentSelect stSelect = controller.getSelect();
				StudentVO st = stSelect.select(id);
				
				if(st != null) { // 있으면 
					System.out.print("바꿀 번호를 입력하세요 : ");
					int num = scan.nextInt();
					
					System.out.print("바꿀 이름을 입력하세요 : ");
					String name = scan.next();
					
					StudentUpdate stUpdate = controller.getUpdate();
					stUpdate.update(new StudentVO(id, num, name));
				}
			} else if (selectMenu == 3) {
				// 삭제 : 아이디를 입력받아서 해당되는 아이디가 있으면 삭제
				System.out.print("아이디를 입력하세요 : ");
				String id = scan.next();
				
				StudentDelete stDelete = controller.getDelete();
				stDelete.delete(id);

			} else if (selectMenu == 4) {
				
				System.out.print("아이디를 입력하세요 : ");
				String id = scan.next();
				
				StudentSelect stSelect = controller.getSelect();
				StudentVO st = stSelect.select(id);
				
				if (st != null) st.printOneInfo();
			
			} else if (selectMenu == 5) {
				
				StudentSelectAll stAll = controller.getSelectAll();
				stAll.printAll();
			
			} else if (selectMenu == 6) {
				
				System.out.println("종료");
				scan.close();
				break;
			}
		}
	}
}
