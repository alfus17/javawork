package _05_interface;

public class DataAccessRun {

	public static void main(String[] args) {
		
		
		DataAccess mysql = new MySql();
		mysql.insert();
		mysql.delete();
		mysql.update();
		mysql.select();
		
		mysql = new Oracle();
		mysql.select();
		mysql.update();
		mysql.delete();
		mysql.insert();

	}

}
