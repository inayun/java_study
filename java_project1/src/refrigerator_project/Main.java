package refrigerator_project;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ArrayList<Food> foodArr = new ArrayList();
		FoodList foodlist = new FoodList();
		User user = new User();

		System.out.println("�ȳ��ϼ��� ��緥���Դϴ�.");
		System.out.println("�� ���͵帱��� ? ");

		System.out.print("���̵� :  ");
		String id = scanner.next();

		user.setId(id);
		
		try {
			UserLoader loader = new UserLoader(user);
			user = loader.getUser();
		} catch (IOException e) {
			e.printStackTrace();
		}

		foodArr = foodlist.insertFood();
		outer : while(true) {

			System.out.println("1. ��� �Է�");
			System.out.println("2. �����");
			System.out.println("3. �� Į�θ� ����");
			System.out.println("4. ����");
			System.out.print(">> ");

			inner : switch(scanner.nextInt()) {

			case 1: // ��� �Է��ؼ� �丮��õ
				SearchFood searchFo = new SearchFood();
				if(searchFo.searchFood(foodArr)) {
					user = searchFo.showFoodRecipe(user);
				}
				break inner;

			case 2: // ���� �˻��ؼ� ����� Ȯ��
				SearchNutrient searchNu = new SearchNutrient();
				searchNu.searchNutrient(foodArr);
				break inner;

			case 3: //������ ������ ���ĵ� Į�θ� ���
				MyCalorie myCal = new MyCalorie();
				
				if(myCal.calculator(user, foodArr)) {
					user = myCal.getUser();
					if(myCal.DeleteMyfood(user)) {
						user = myCal.getUser();
						break inner;
					}
				} 
				break inner;

			case 4: //����
				System.out.print("���� Į�θ� ������ �����Ͻðڽ��ϱ�? (y|n) : ");

				String input = scanner.next();
				if(input.equalsIgnoreCase("Y")) {
				
					try {
						UserWriter writer = new UserWriter(user);
					} catch (IOException e) {
						e.printStackTrace();
					}
				} 
				System.out.println("����!");
				
				break outer;
			}
		}
	}

}
