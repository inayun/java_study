package ex3_super;

public class Parent {

	int num;
	int num2;
	
	public Parent(int n) {
		System.out.println(n);
		System.out.println("부모클래스의 생성자");
	}

	public int getResult(int n, int n2) {
		return -1;
	}
}
