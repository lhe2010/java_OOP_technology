package step9_05.student;

import java.util.Map;

// DAO (Data Access Object) : DB로 부터 데이터를 i/o 하는 객체
public class StudentDAO {
	
	public void insert(StudentVO st) {
		StudentRepository.getStDB().put(st.getId(), st);
	}
	
	public StudentVO select(String id) {
		return StudentRepository.getStDB().get(id);
	}
	
	public void delete(String id) {
		StudentRepository.getStDB().remove(id);
	}
	
	public void update(StudentVO st) {
		StudentRepository.getStDB().put(st.getId(), st);
	}
	
	public Map<String , StudentVO> getStudentDB(){
		return StudentRepository.getStDB();
	}
}
