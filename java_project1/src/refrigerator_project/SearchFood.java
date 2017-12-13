package refrigerator_project;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchFood {

	//음식 재료 입력해서 해당 재료 포함하는 음식 추천

	ArrayList<Food> foodArr = new ArrayList();
	Scanner scanner = new Scanner(System.in);
	ArrayList<Food> foodArrForUser = new ArrayList();

	public void searchFood(ArrayList<Food> foodArr) {
		this.foodArr = foodArr;
		
		System.out.print("재료 입력 : ");
		String input = scanner.nextLine();
		
		//입력한 재료들을 띄어씌기로 자르기
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
		 *  입력한 재료들이 데이터에 없으면( 만약 foodArrForUser의 사이즈가  0이면 )
		 *  "해당재료에 대한 데이터가 없습니다." 출력할것
		 *  
		 */
		
		
		
	}
	
	
}
