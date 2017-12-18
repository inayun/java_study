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
			  + "ㆍㆍㆍ고든램지의 냉장고를 부탁해ㆍㆍㆍ\n"
			  + "ㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍ \n"
			  + "=========================\n"
				);
		
		System.out.println("안녕하세요 고든램지입니다.");
		System.out.println("뭘 도와드릴까요 ? ");
		System.out.println();
	}
	
	public void menuView(User user) {
		this.user = user;
		foodArr = foodlist.getFoodArr();
		int num = 0;
		
		//메뉴판 출력
		outer : while(true) {
			scanner = new Scanner(System.in);

			System.out.println("1. 냉장고를 부탁해");
			System.out.println("2. 영양소를 알려줘 ");
			System.out.println("3. 내 칼로리 포켓");
			System.out.println("4. 종료");
			System.out.print(">> ");
			
			try {
				num = scanner.nextInt();
			} catch (Exception e) {
				continue outer;
			}
			
			inner : switch(num) {
			case 1: // 재료 입력해서 요리추천
				SearchFood searchFo = new SearchFood();
				if(searchFo.searchFood(foodArr)) {
					searchFo.showFoodRecipe(user);
					user = searchFo.getUser();
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
				
			default :
				System.out.println("입력이 올바르지 않습니다.");
				break inner;
			}
		} //while
	
	}
}
