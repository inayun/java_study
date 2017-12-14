package refrigerator_project;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchFood {

	//���� ��� �Է��ؼ� �ش� ��� �����ϴ� ���� ��õ

	ArrayList<Food> foodArr = new ArrayList();
	Scanner scanner = new Scanner(System.in);
	ArrayList<Food> foodArrForUser = new ArrayList();
	User user = new User();

	public boolean searchFood(ArrayList<Food> foodArr) {
		this.foodArr = foodArr;

		System.out.print("��� �Է� : ");
		String input = scanner.nextLine();

		//�Է��� ������ ����� �ڸ���
		String[] userIngred = input.split("\\s"); 

		top : for(int i = 0; i < userIngred.length; i++) {
			middle : for(int j = 0; j < foodArr.size(); j++) {

				if(foodArr.get(j).getIngredient().contains(userIngred[i])) {

					bottom : for(Food food : foodArrForUser) {
						if(food.getFoodName().equals(foodArr.get(j).getFoodName())) {
							continue middle;
						}
					} //bottom
				foodArrForUser.add(foodArr.get(j));
				} 
			} //middle
		} //top
		if(foodArrForUser.size() != 0) {

			for(int i = 0; i < foodArrForUser.size(); i++) {
				System.out.printf("%d. %s\n",i+1,foodArrForUser.get(i).getFoodName());
			}

			System.out.println("------------------------------");
			return true;
			
		} else {
			System.out.println("�ش���ῡ ���� �����Ͱ� ����");
			System.out.println("------------------------------");
		}
		return false;	

	} //searchFood


	public User showFoodRecipe(User user) {
		this.user = user;

		int count = 0;
		int i = 0;
		boolean isMenu = false;
		String input="";

		outer : while(true) {

			System.out.print(">> ���� ����Ʈ �� �����Ǹ� ���� ���� ������ �̸��� �����ּ���(�޴�����:m) : ");
			input = scanner.nextLine();
			System.out.println();
			
			if(input.equalsIgnoreCase("m")) {
				isMenu = true;
				break outer;
			}

			for(i = 0; i <foodArrForUser.size(); i++) {

				if(foodArrForUser.get(i).getFoodName().equals(input)) {
					System.out.println("<" + foodArrForUser.get(i).getFoodName() +">");
					System.out.println(foodArrForUser.get(i).getRecipe());
					break outer;
				} else {
					count++;
				}
			}

		} //while

		if(count == foodArrForUser.size()) {
			System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է����ּ���!");
		} else if(isMenu==false && count != foodArrForUser.size()){
			System.out.print(">> �ش� ������ ���� Į�θ����Ͽ� ��ڽ��ϱ�? (y|n): ");
			input = scanner.next();
			if(input.equalsIgnoreCase("Y")) {
				// ���� Į�θ� ����Ʈ�� ���
				user.setFoodList(foodArrForUser.get(i));
				System.out.println("��� �Ϸ�!");
				System.out.println("------------------------------");
			} 
		} else if(isMenu) {
			
		}
		
		return user;
	}	
}
