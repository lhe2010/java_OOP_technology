package step9_05.student;

// Controller : 페이지 이동 기능 
public class Controller {
	
	private StudentDAO stDAO; 
	// DAO를 싱글턴으로 해도되고, 모든 서비스에서 다 따로 만들어도되고 지금 예제처럼 컨트롤러에 하나 만들어도됨.
	// 어차피 DAO는 DB에만 접근하는 역할이니까 하나여도되고 여러개여도 문제는 없음
	private StudentInsert insert;
	private StudentSelect select;	
	private StudentSelectAll selectAll;
	private StudentDelete delete;
	private StudentUpdate update;
	
	public Controller() {
		stDAO = new StudentDAO();	
		insert = new StudentInsert(stDAO);
		select = new StudentSelect(stDAO);
		selectAll = new StudentSelectAll(stDAO);
		delete = new StudentDelete(stDAO);
		update = new StudentUpdate(stDAO);
	}
	
	public StudentDAO getStDAO() {
		return stDAO;
	}
	
	public void setStDAO(StudentDAO stDAO) {
		this.stDAO = stDAO;
	}
	
	public StudentInsert getInsert() {
		return insert;
	}
	
	public void setInsert(StudentInsert insert) {
		this.insert = insert;
	}
	
	public StudentSelect getSelect() {
		return select;
	}
	
	public void setSelect(StudentSelect select) {
		this.select = select;
	}
	
	public StudentSelectAll getSelectAll() {
		return selectAll;
	}
	
	public void setSelectAll(StudentSelectAll selectAll) {
		this.selectAll = selectAll;
	}

	public StudentDelete getDelete() {
		return delete;
	}

	public void setDelete(StudentDelete delete) {
		this.delete = delete;
	}

	public StudentUpdate getUpdate() {
		return update;
	}

	public void setUpdate(StudentUpdate update) {
		this.update = update;
	}
}
