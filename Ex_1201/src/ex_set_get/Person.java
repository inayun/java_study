package ex_set_get;

public class Person {

	private String name;
	private int age;
	private int reg_number = 10;
	
	//��������� ����Ű�� ������ this�� �ۼ�. Ŭ������ ������ �ǹ�
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
