package ex_string;

public class Ex2_String_Method {

	public static void main(String[] args) {

		//��� �޼ҵ�� �Ұ�ȣ�� ������ ����
		String str = "Hong Gil Dong";
		System.out.println("str�� ���� : " + str.length()); // 13
		
		//�� ó�� g�� ��ġ 
		int index = str.indexOf('g');
		System.out.println(index);
		
		//�� ������ g�� ��ġ
		index = str.lastIndexOf('o');
		System.out.println(index);

		//Gil�̶� �ܾ��� ������ġ
		index = str.indexOf("Gil");
		System.out.println(index);
		
		//�ش� �ε������� ������ ����
		char c = str.charAt(5);
		System.out.println(c);
		
		String str2 = str.substring(1,7);
		System.out.println(str2);
		
		//equals �� ��ҹ��� ������! => equalsIgnoreCase ��ҹ��� ����
		String test = "Apple";
		if(test.equalsIgnoreCase("apple")) {
			System.out.println("���� �����ϴ�.");
		}
		
		String name = " ȫ�浿 ";
		String name2 = name.trim(); //���� �յ��� �ǹ̾��� ���� ����
		System.out.println(name.length()); //5��...
		System.out.println(name2.length()); //3��
		
		//���������� ���ڿ��� ���� ������ �ٲ��ִ� �޼���(���) 
		String number = "100";
		int n = Integer.parseInt(number);
		
				
		
	}

}
