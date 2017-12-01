package ex_set_get;

public class Person {

	private String name;
	private int age;
	private int reg_number = 10;
	
	//멤버변수를 가리키고 싶으면 this를 작성. 클래스의 변수를 의미
	public void setInfo(String name, int age ) {
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getReg_number() {
		return reg_number;
	}
}
