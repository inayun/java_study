package ex3_ArrayList;

import java.util.ArrayList;

public class Ex1_ArrayList {

	/*
	 * ArrayList
	 * �ڵ� ������ �����ִµ�
	 * �ε����� �ֿ�
	 * 
	 */
	
	 public static void main(String[] args) {
		
		 ArrayList<Integer> list = new ArrayList();
		 //List<Integer> list = new ArrayList();
		 
		 list.add(100);
		 list.add(200);
		 list.add(300);
		 
		 //Ư�� '�ε���'�� ����
		 list.remove(1); // 200�� ������ [ 100, 300 ]
		 //Ư�� �ε����� ���� �������
		 list.add(1,400); //[100, 400, 300]
		 list.add(0,300);
		 //set�� �ش� �ε����� ���� '��ü'�ϴ� ��
		 list.set(2,500);
		 
		 System.out.println(list);
	}
	
}
