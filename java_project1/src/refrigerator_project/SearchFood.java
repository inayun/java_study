package refrigerator_project;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchFood {

	//���� ��� �Է��ؼ� �ش� ��� �����ϴ� ���� ��õ

	Scanner scanner = new Scanner(System.in);
	private ArrayList<Food> foodArr;
	private ArrayList<Food> foodArrForUser = new ArrayList();
	private User user = null;
	
	public User getUser() {
		return user;
	}

	public boolean searchFood(ArrayList<Food> foodArr) {
		this.foodArr = foodArr;

		System.out.print("��� �Է� : ");
		String input = scanner.nextLine();

		//�Է��� ������ ����� �ڸ���
		String[] userIngred = input.split("\\s"); 

		 for(int i = 0; i < userIngred.length; i++) {
			middle : for(int j = 0; j < foodArr.size(); j++) {

				if(foodArr.get(j).getIngredient().contains(userIngred[i])) {

					 for(Food food : foodArrForUser) {
						if(food.getFoodName().equals(foodArr.get(j).getFoodName())) {
							continue middle;
						}
					} 
				foodArrForUser.add(foodArr.get(j));
				} 
			} 
		} 
		if(foodArrForUser.size() != 0) {

			for(int i = 0; i < foodArrForUser.size(); i++) {
				System.out.printf("%d. %s\n",i+1,foodArrForUser.get(i).getFoodName());
			}

			System.out.println("------------------------------");
			return true;
			
		} else {
			System.out.println("�ش� ��ῡ ���� �����Ͱ� �����ϴ�.");
			System.out.println("------------------------------");
		}
		return false;	

	} //searchFood


	public void showFoodRecipe(User user) {
		this.user = user;

		int count = 0;
		int index = 0;
		boolean isMenu = false;
		String input="";

		outer : while(true) {
			count = 0;
			
			System.out.print(">> ���� ����Ʈ �� '������'�� ���� ���� ������ '�̸�'�� �����ּ���(�޴�����:m) : ");
			input = scanner.nextLine();
			System.out.println();
			
			if(input.equalsIgnoreCase("m")) {
				isMenu = true;
				break outer;
			}

			inner : for(int i = 0; i <foodArrForUser.size(); i++) {

				if(foodArrForUser.get(i).getFoodName().equals(input)) {
					System.out.println("<" + foodArrForUser.get(i).getFoodName() +">");
					System.out.println(foodArrForUser.get(i).getIngredient());
					System.out.println();
					System.out.println(foodArrForUser.get(i).getRecipe());
					index = i;
					break inner;
				} else {
					count++;
				}
			} //inner
			
			if(count == foodArrForUser.size()) {
				System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է����ּ���!");
				continue outer;
			}
			break outer;
		} //while
		
		
		if(isMenu==false && count != foodArrForUser.size()){
			System.out.print(">> �ش� ������ ���� Į�θ� ���Ͽ� ��ڽ��ϱ�? (y|n): ");
			input = scanner.next();
			if(input.equalsIgnoreCase("Y")) {
				// ���� Į�θ� ����Ʈ�� ���
				user.setFoodList(foodArrForUser.get(index));
				System.out.println("��� �Ϸ�!");
				System.out.println("------------------------------");
			} 
		} else if(isMenu) {
		}
	}	
}
