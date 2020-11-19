package step9_05.student;

public class StudentUpdate {
	
	private StudentDAO studentDAO;
	
	public StudentUpdate(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}
	
	// 수정 : 아이디를 입력받아서 해당되는 아이디가 있으면
	// 이름과 번호를 변경할 수 있는 기능
	public void update(StudentVO studentVO) {
		studentDAO.update(studentVO);
	}
	
	public boolean checkId(String id) {
		StudentVO studentVO = studentDAO.getStudentDB().get(id);
		return studentVO != null ? true : false; 
	}
	

}
