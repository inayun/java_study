package ex_set_get;

public class PersonMain {

	public static void main(String[] args) {

		Person p1 = new Person();
		p1.setName("ȫ�浿");
		p1.setAge(50);
		
		System.out.println("�̸�: " + p1.getName());
		System.out.println("����: " + p1.getAge());
		
		System.out.println("-----------");
		p1.setInfo("��浿", 30);

	}

}
