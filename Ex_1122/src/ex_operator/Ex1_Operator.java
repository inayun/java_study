package ex_operator;

public class Ex1_Operator {

	public static void main(String[] args) {
		
		/*
		 * ������
		 * 
		 * 1. �ְ� ������ : . , ()
		 * 2. ���� ������ : ++ , --
		 * 3. ��� ������ : +, -, *, /, %
		 * 4. ����Ʈ ������ : >> , << , >>>
		 * 5. �� ������ : >, < , >=, <=, ==, !=
		 * 6. ��Ʈ ������ : &, |, ^, ~
		 * 7. ���� ������ : &&, || , !
		 * 8. ����(����) ������ : ?, :
		 * 9. ���� ������ : =, *=, /=, %=, +=, -=
		 */
		
		/* ���������
		 *  4Ģ ����� ������ �����ڸ� ������ ����
		 */
		int n1, n2, n3;
		n1 = 20; 
		n2 = 7;
		n3 = n1 + n2;
		System.out.println(n3);
		
		n3 = n1 / n2; 
		System.out.println(n3); // �� 2
		
		n3 = n1 % n2; //��ⷯ
		System.out.println(n3); //������ 6
		
		/* ���� ������
		 * Ư�� ���� ������ �����Ͽ� ����ų�� ���
		 */
		
		int i1 = 10;
		int i2 = 7;
		i1 += i2;
		
		System.out.println(i1); //17
		i1 -= 5;
		
		System.out.println(i2); //7
		
		i1 %= 5;
		// i1 = i1 % 5;
		System.out.println(i1); //2
		
		
	}

}