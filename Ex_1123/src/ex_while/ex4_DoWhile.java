package ex_while;

import java.util.Random;

public class ex4_DoWhile {

	public static void main(String[] args) {

		/* 
		 * ����
		 * java, jsp, android�� ������ ��
		 * 
		 * ���� ������ �˻��ϴ� ������ do-while�� �ۼ��ϴµ�,
		 * �� �����̶� 100���� �Ѿ�� ��쿡
		 * 0~130�������� ������ �߻��ɶ����� ������Ų��
		 * 
		 * �̷��� �� ������ ������ ���  0 ~ 100�� ���̰� �Ǹ�
		 * do-while���� �������ͼ� �� ������ ������ ȭ�鿡 ��µǵ��� �ϴ� �ڵ�
		 * 
		 */
		
		int java,jsp,android = 0;

		do {
			java = new Random().nextInt(131);
			jsp = new Random().nextInt(131);
			android = new Random().nextInt(131);
			
		} while(java > 100 || jsp > 100 || android > 100);
		System.out.println("java : " + java);
		System.out.println("jsp : " + jsp);
		System.out.println("android : " + android);
	
	}

}
