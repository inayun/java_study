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

		System.out.println("안녕하세요 고든램지입니다.");
		System.out.println("뭘 도와드릴까요 ? ");

		System.out.print("아이디 :  ");
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

			System.out.println("1. 재료 입력");
			System.out.println("2. 영양소");
			System.out.println("3. 내 칼로리 포켓");
			System.out.println("4. 종료");
			System.out.print(">> ");

			inner : switch(scanner.nextInt()) {

			case 1: // 재료 입력해서 요리추천
				SearchFood searchFo = new SearchFood();
				if(searchFo.searchFood(foodArr)) {
					user = searchFo.showFoodRecipe(user);
				}
				break inner;

			case 2: // 음식 검색해서 영양소 확인
				SearchNutrient searchNu = new SearchNutrient();
				searchNu.searchNutrient(foodArr);
				break inner;

			case 3: //유저가 섭취한 음식들 칼로리 계산
				MyCalorie myCal = new MyCalorie();
				
				if(myCal.calculator(user, foodArr)) {
					user = myCal.getUser();
					if(myCal.DeleteMyfood(user)) {
						user = myCal.getUser();
						break inner;
					}
				} 
				break inner;

			case 4: //종료
				System.out.print("나의 칼로리 포켓을 저장하시겠습니까? (y|n) : ");

				String input = scanner.next();
				if(input.equalsIgnoreCase("Y")) {
				
					try {
						UserWriter writer = new UserWriter(user);
					} catch (IOException e) {
						e.printStackTrace();
					}
				} 
				System.out.println("종료!");
				
				break outer;
			}
		}
	}

}
