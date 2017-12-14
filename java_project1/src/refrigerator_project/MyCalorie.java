package refrigerator_project;

import java.util.ArrayList;
import java.util.Scanner;

public class MyCalorie {
	//아이디별로 담아놓은 음식들 메모장에 입 출력하기

	ArrayList<Food> foodArr = new ArrayList();
	User user = new User();
	Scanner scanner = new Scanner(System.in);
	
	public void calculator(User user, ArrayList<Food> foodArr) {
		this.foodArr = foodArr;
		float myCalorie = 0;
		
		System.out.println("<나의 칼로리 포켓 리스트>");
		
		for(int i = 0; i < user.getFoodList().size(); i++) {
			System.out.printf("%d. %s \n", i+1, user.getFoodList().get(i).getFoodName());
		}
		
		for(Food food : user.getFoodList()) {
			myCalorie += food.getCalorie();
		}
		
		System.out.println("나의 칼로리 : " + myCalorie + "cal");
		
		System.out.println("------------------------------");

	}
}
