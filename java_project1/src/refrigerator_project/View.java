package refrigerator_project;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class View {

	private ArrayList<Food> foodArr = null;
	private User user = null;
	private FoodList foodlist = new FoodList();
	private Scanner scanner;
	
	public View() {}
	
	public void startView() {
		
		System.out.print(
				"=========================\n"
			  + "��������緥���� ����� ��Ź�ؤ�����\n"
			  + "�������������������������������������� \n"
			  + "=========================\n"
				);
		
		System.out.println("�ȳ��ϼ��� ��緥���Դϴ�.");
		System.out.println("�� ���͵帱��� ? ");
		System.out.println();
	}
	
	public void menuView(User user) {
		this.user = user;
		foodArr = foodlist.getFoodArr();
		int num = 0;
		
		//�޴��� ���
		outer : while(true) {
			scanner = new Scanner(System.in);

			System.out.println("1. ����� ��Ź��");
			System.out.println("2. ����Ҹ� �˷��� ");
			System.out.println("3. �� Į�θ� ����");
			System.out.println("4. ����");
			System.out.print(">> ");
			
			try {
				num = scanner.nextInt();
			} catch (Exception e) {
				continue outer;
			}
			
			inner : switch(num) {
			case 1: // ��� �Է��ؼ� �丮��õ
				SearchFood searchFo = new SearchFood();
				if(searchFo.searchFood(foodArr)) {
					searchFo.showFoodRecipe(user);
					user = searchFo.getUser();
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
				
			default :
				System.out.println("�Է��� �ùٸ��� �ʽ��ϴ�.");
				break inner;
			}
		} //while
	
	}
}
