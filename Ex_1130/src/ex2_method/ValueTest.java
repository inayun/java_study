package ex2_method;

public class ValueTest {

		// ���������� �޼ҵ�� (�Ķ���� /����/�Ű�����){};
	public void test( int n ) {
		System.out.println(n+ "�� �Է��ϼ̱���.");
	}
	
	public void test( String n ) {
		System.out.println(n+ "�� �Է��ϼ̱���.");
	}
	
	public int test2( int n ) {
		n++;
		System.out.println("sub : " + n);
		
		return n;
	}
	
	public String test3(int n1, int n2) {
		
		return n1 + "+" + n2;
	}
}
