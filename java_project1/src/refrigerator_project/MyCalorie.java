package refrigerator_project;

import java.util.ArrayList;
import java.util.Scanner;

public class MyCalorie {
	//���̵𺰷� ��Ƴ��� ���ĵ� �޸��忡 �� ����ϱ�

	ArrayList<Food> foodArr = new ArrayList();
	User user = new User();
	Scanner scanner = new Scanner(System.in);
	
	public void calculator(User user, ArrayList<Food> foodArr) {
		this.foodArr = foodArr;
		
		System.out.println("<���� Į�θ� ���� ����Ʈ>");
		
		for(int i = 0; i < user.getFoodList().size(); i++) {
			System.out.printf("%d. %s \n", i+1, user.getFoodList().get(i).getFoodName());
		}
		System.out.println("------------------------------");

	}
}