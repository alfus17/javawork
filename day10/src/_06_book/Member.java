package _06_book;

public class Member {
	String name;
	int age;
	String gender;
	
	Member(){
		
	}
	Member(String name,int age,String gender){
		this.age= age;
		this.name = name;
		this.gender = gender;
	}
	
	//setter
	void setName(String name) {
		this.name = name;
	}
	void setAge(int age) {
		this.age = age;
	}
	void setGender(String gender) {
		this.gender = gender;
	}
	//getter
	String getName() {
		return this.name;
	}
	int getAge() {
		return this.age;
	}
	String getGender() {
		return this.gender;
	}
	
	// member toString Overriding
	public String toString() {
		return "이름 : " + name + ", 나이 : " + age + " , 성별 : " + gender;
	}
	

}
