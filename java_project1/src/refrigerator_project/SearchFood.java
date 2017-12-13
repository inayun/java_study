package refrigerator_project;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchFood {

	//���� ��� �Է��ؼ� �ش� ��� �����ϴ� ���� ��õ

	ArrayList<Food> foodArr = new ArrayList();
	Scanner scanner = new Scanner(System.in);
	ArrayList<Food> foodArrForUser = new ArrayList();

	public void searchFood(ArrayList<Food> foodArr) {
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
			}
		}
		showFoodList();
	} //searchFood
	
	public void showFoodList() {
		
		for(int i = 0; i < foodArrForUser.size(); i++) {
			System.out.printf("%d. %s\n",i+1,foodArrForUser.get(i).getFoodName());
		}
		
		
		/*
		 *  TODO
		 *  �Է��� ������ �����Ϳ� ������( ���� foodArrForUser�� �����  0�̸� )
		 *  "�ش���ῡ ���� �����Ͱ� �����ϴ�." ����Ұ�
		 *  
		 */
		
		
		
	}
	
	
}
