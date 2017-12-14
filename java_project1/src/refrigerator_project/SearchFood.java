package refrigerator_project;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchFood {

	//음식 재료 입력해서 해당 재료 포함하는 음식 추천

	ArrayList<Food> foodArr = new ArrayList();
	Scanner scanner = new Scanner(System.in);
	ArrayList<Food> foodArrForUser = new ArrayList();
	User user = new User();

	public boolean searchFood(ArrayList<Food> foodArr) {
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
			} //middle
		} //top
		if(foodArrForUser.size() != 0) {
			
			for(int i = 0; i < foodArrForUser.size(); i++) {
				System.out.printf("%d. %s\n",i+1,foodArrForUser.get(i).getFoodName());
			}
			
			System.out.println("------------------------------");
			return true;
		}
		
	return false;	
		
	} //searchFood

		/*
		 *  TODO
		 *  입력한 재료들이 데이터에 없으면( 만약 foodArrForUser의 사이즈가  0이면 )
		 *  "해당재료에 대한 데이터가 없습니다." 출력할것
		 *  
		 */

	public User showFoodRecipe(User user) {
		this.user = user;
		
		int count = 0;
		int i = 0;
		String input="";
		
		outer : while(true) {

			System.out.print(">> 위의 리스트 중 레시피를 보고 싶은 음식의 이름을 적어주세요 : ");
			input = scanner.nextLine();
			System.out.println();

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
			System.out.println("잘못된 입력입니다. 다시 입력해주세요!");
		} else {
			System.out.print(">> 해당 음식을 나의 칼로리포켓에 담겠습니까? (y|n): ");

			input = scanner.next();
			if(input.equalsIgnoreCase("Y")) {
				// 나의 칼로리 리스트에 담기
				user.setFoodList(foodArrForUser.get(i));
				System.out.println("담기 완료!");
				System.out.println("------------------------------");
			} 
		}
		return user;
	}	
}
