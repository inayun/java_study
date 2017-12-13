package refrigerator_project;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ArrayList<Food> foodArr = new ArrayList();
		FoodList foodlist = new FoodList();
		
		System.out.println("안녕하세요 고든램지입니다.");
		System.out.println("뭘 도와드릴까요 ? ");
		
		System.out.print("아이디 :  ");
		String id = scanner.next();
		
		/*
		 * TODO
		 * (인아)
		 * 아이디로 메모장 오가기
		 */
		
		System.out.println(id + "님 입장");
		foodArr = foodlist.insertFood();
		
		/*
		 * TODO
		 * (인아)
		 * while로 반복
		 */
		
		System.out.println("1. 재료 입력");
		System.out.println("2. 영양소");
		System.out.println("3. 개인 칼로리정보");
		System.out.println("4. 종료");
		System.out.print(">> ");
		
		switch(scanner.nextInt()) {
		
		case 1: // 재료 입력해서 요리추천
			
			SearchFood searchFo = new SearchFood();
			searchFo.searchFood(foodArr);
			break;
			
		case 2: // 음식 검색해서 영양소 확인
			SearchNutrient searchNu = new SearchNutrient();
			searchNu.searchNutrient(foodArr);
			break;
			
		case 3: //유저가 섭취한 음식들 칼로리 계산
			MyCalorie myCal = new MyCalorie();
			myCal.calculator(foodArr);
			
			break;
			
		case 4: //종료
			break;
			
		}
		
	}

}
