package step9_05.student;

//Service : 데이터 변경 로직 
public class StudentDelete {
	
	private StudentDAO studentDAO;
	
	public StudentDelete(StudentDAO studentDAO) { 
		this.studentDAO = studentDAO;		
	}
	
	public void delete(String id) {
		if(checkId(id))
			System.out.println("없는 아이디 입니다. ");
		else 
			studentDAO.delete(id);
	}
	
	public boolean checkId(String id) {
		StudentVO studentVO = studentDAO.select(id);
		return studentVO == null ? true : false;
	}
}
