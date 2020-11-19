package step9_05.student;

import java.util.Map;

//Service : 데이터 변경 로직 
public class StudentSelectAll {
	
	private StudentDAO studentDAO;
	
	public StudentSelectAll(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}
	
	public Map<String , StudentVO> allSelect(){
		return studentDAO.getStudentDB();
	}
	
	public void printAll() {
		
		Map<String , StudentVO> map = studentDAO.getStudentDB();
		
		for (String key : map.keySet()) {
			map.get(key).printOneInfo();
		}
	}
}
