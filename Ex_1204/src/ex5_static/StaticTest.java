package ex5_static;

public class StaticTest {

	String str1 = "�Ϲ� �������";
	static String str2 = "����ƽ ����";
	
	public static String getResult2() {
		//����ƽ �޼��� ���ο����� static ������ ���� ����
		// str1 �� ����� �� ����!
		
		return str2;
	}
	public String getResult() {
		return str2;
		
	}
}
