package _05_interface;

public class MySql implements DataAccess{
	
	
	@Override
	public void delete() {
		System.out.println("Mysql에서 삭제");
	}
	@Override
	public void insert() {
		System.out.println("Mysql에서 삽입");

	}
	@Override
	public void select() {
		System.out.println("Mysql에서 검색");
		
	}
	@Override
	public void update() {
		System.out.println("Mysql에서 수정");
	}

}
