package refrigerator_project;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ArrayList<Food> foodArr = new ArrayList();
		FoodList foodlist = new FoodList();
		
		System.out.println("�ȳ��ϼ��� ��緥���Դϴ�.");
		System.out.println("�� ���͵帱��� ? ");
		
		System.out.print("���̵� :  ");
		String id = scanner.next();
		
		/*
		 * TODO
		 * (�ξ�)
		 * ���̵�� �޸��� ������
		 */
		
		System.out.println(id + "�� ����");
		foodArr = foodlist.insertFood();
		
		/*
		 * TODO
		 * (�ξ�)
		 * while�� �ݺ�
		 */
		
		System.out.println("1. ��� �Է�");
		System.out.println("2. �����");
		System.out.println("3. ���� Į�θ�����");
		System.out.println("4. ����");
		System.out.print(">> ");
		
		switch(scanner.nextInt()) {
		
		case 1: // ��� �Է��ؼ� �丮��õ
			
			SearchFood searchFo = new SearchFood();
			searchFo.searchFood(foodArr);
			break;
			
		case 2: // ���� �˻��ؼ� ����� Ȯ��
			SearchNutrient searchNu = new SearchNutrient();
			searchNu.searchNutrient(foodArr);
			break;
			
		case 3: //������ ������ ���ĵ� Į�θ� ���
			MyCalorie myCal = new MyCalorie();
			myCal.calculator(foodArr);
			
			break;
			
		case 4: //����
			break;
			
		}
		
	}

}
