package refrigerator_project;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchNutrient {
	//검색한 음식의 영양소 출력
	private ArrayList<Food> foodArr;
	Scanner scanner = new Scanner(System.in);

	public void searchNutrient(ArrayList<Food> foodArr) {
		this.foodArr = foodArr;

		System.out.print("음식 검색 : ");
		String input = scanner.nextLine();
		int count = 0;
		
		for (int i = 0; i < foodArr.size(); i++) {
			if(   foodArr.get(i).getFoodName().equals(input)  )  {
				System.out.println("<"+ foodArr.get(i).getFoodName() +">");
				System.out.println(foodArr.get(i).getCalorie()+"cal");
				System.out.println(foodArr.get(i).getNutrient());

			} else {
				count++;
			}
		} //for
		
		if (count == foodArr.size())
		System.out.println("해당하는 음식이 없습니다.");
			
		scanner.close();
	}
}
