package refrigerator_project;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchNutrient {
	//�˻��� ������ ����� ���
	ArrayList<Food> foodArr = new ArrayList();
	
	public void searchNutrient(ArrayList<Food> foodArr) {
		this.foodArr = foodArr;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� �˻� : ");
		String input = scanner.next();
		
		
		/*
		 * TODO
		 * foodArr ������ ��ŭ �ݺ��ϸ鼭
		 * foodArr�� �ִ� ������ �̸���  �Է¹��� ��ǲ�� ���ϱ�
		 * foodArr.get(i).getFoodName().equals(input)
		 * 
		 * ������ : 
		 * foodArr.get(i).getCalorie()
		 * foodArr.get(i).getNutrient()
		 * ���
		 * 
		 * ������ :
		 * "�ش��ϴ� ���� ����" ���
		 * 
		 */
		
	}

}
