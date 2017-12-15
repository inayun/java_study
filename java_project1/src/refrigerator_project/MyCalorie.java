package refrigerator_project;

import java.util.ArrayList;
import java.util.Scanner;

public class MyCalorie {
	//아이디별로 담아놓은 음식들 메모장에 입 출력하기

	private ArrayList<Food> foodArr = null;
	private User user = null;
	private Scanner scanner;


	public User getUser() {
		return user;
	}

	public boolean calculator(User user, ArrayList<Food> foodArr) {

		this.foodArr = foodArr;
		this.user = user;
		float myCalorie = 0;
		float standard  = 600;

		System.out.println("<나의 칼로리 포켓 리스트>");

		for(int i = 0; i < user.getFoodList().size(); i++) {
			System.out.printf("%d. %s \n", i+1, user.getFoodList().get(i).getFoodName());
		}

		for(Food food : user.getFoodList()) {
			myCalorie += food.getCalorie();
		}

		System.out.println("나의 칼로리 : " + myCalorie + "cal");
		System.out.println();

		if(  myCalorie - standard < 0 ) {
			//제일말랐을때
			System.out.println("(x_x)"+" 굶어죽겠음" );
		}else if( 0 <= myCalorie - standard &&  myCalorie - standard < 200  ) {
			System.out.println("(;_;)"+"배고파서 눈물남"); //덜마른
		}else if( 201 <= myCalorie - standard &&  myCalorie - standard < 400  ) {
			System.out.println("( +_+)"+"배고픔.."); //덜마른
		}else if( 401 <= myCalorie - standard &&  myCalorie - standard < 600  ) {
			System.out.println("( o_o)"+"뭐먹지?"); //정상
		}else if( 601 <= myCalorie - standard &&  myCalorie - standard < 800  ) {
			System.out.println(" ( o _o)"+"살찐거같아"); //조금뚱뚱
		}else if( 801 <= myCalorie - standard &&  myCalorie - standard < 1000  ) {
			System.out.println("  ( ' ㅡ  ')"+"칼로리초과 뚱뚱"); //뚱뚱
		}else if( 1001 <= myCalorie - standard &&  myCalorie - standard < 1200  ) {
			System.out.println("  ( -  ㅡ   - )"+"너무많이먹음"); //많이뚱뚱
		}else if( 1201 <= myCalorie - standard &&  myCalorie - standard < 1400  ) {
			System.out.println("( ; -  ㅡㅡ    -  )"+"스모선수같아"); //심각한뚱뚱
		}else if( 1401 <= myCalorie - standard &&  myCalorie - standard < 1600  ) {
			System.out.println("( ; -    X    -)"+"고도비만");//왕뚱뚱
		}

		System.out.println("------------------------------");

		if(myCalorie == 0) {
			return false;
		} 
		return true;
	}

	public boolean DeleteMyfood(User user) {
		this.user = user;
		int count;
		scanner = new Scanner(System.in);

		outer : while(true) {
			count = 0;
			System.out.print("나의 칼로리 포켓에서 '삭제'하고 싶은 음식의 '이름'을 입력해주세요(메뉴가기:m) : ");
			String input = scanner.nextLine();

			if(input.equalsIgnoreCase("m")) {
				return true;
			}

			for(int i = 0; i < user.getFoodList().size(); i++) {

				if(user.getFoodList().get(i).getFoodName().equals(input)) {
					user.deleteFoodList(i);
					System.out.println("삭제 완료!");
					continue outer;
				} else {
					count++;
				}
			}
			if(count == user.getFoodList().size()) {
				System.out.println("입력이 올바르지 않습니다. 다시 입력해주세요.");
				continue outer;
			}
		} //while
	}
}
