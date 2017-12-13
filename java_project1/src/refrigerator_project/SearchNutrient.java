package refrigerator_project;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchNutrient {
	//검색한 음식의 영양소 출력
	ArrayList<Food> foodArr = new ArrayList();
	
	public void searchNutrient(ArrayList<Food> foodArr) {
		this.foodArr = foodArr;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("음식 검색 : ");
		String input = scanner.next();
		
		
		/*
		 * TODO
		 * foodArr 사이즈 만큼 반복하면서
		 * foodArr에 있는 음식의 이름과  입력받은 인풋과 비교하기
		 * foodArr.get(i).getFoodName().equals(input)
		 * 
		 * 있으면 : 
		 * foodArr.get(i).getCalorie()
		 * foodArr.get(i).getNutrient()
		 * 출력
		 * 
		 * 없으면 :
		 * "해당하는 음식 없음" 출력
		 * 
		 */
		
	}

}
