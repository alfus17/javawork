package _05_interface;

public class Oracle implements DataAccess{
	@Override
	public void delete() {
		System.out.println("Oracle에서 삭제");

	}
	@Override
	public void insert() {
		System.out.println("Oracle에서 삽입");

	}
	@Override
	public void select() {
		System.out.println("Oracle에서 검색");

	}
	@Override
	public void update() {
		System.out.println("Oracle에서 수정");

	}
	
	public void update1() {
		System.out.println("Oracle에서 수1");

	}


}
