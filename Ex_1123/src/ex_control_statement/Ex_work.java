package ex_control_statement;

import java.util.Scanner;

public class Ex_work {

	public static void main(String[] args) {

		
		
		
/*		31 = 1 , 3 , 5 , 7 , 8, 10 ,12
		30 = 4, 6, 9, 11
				28 = 2*/
				
		//switch 로 달력 만들기
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("월을 입력해주세요. ");
		int month = scanner.nextInt();
	
		System.out.println("-------switch-------");
		switch(month) {

		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(month + "월은 31일까지 있습니다.");
			break;
			
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(month + "월은 30일까지 있습니다.");
			break;
			
		case 2:
			System.out.println(month + "월은 28일까지 있습니다.");
			break;
		
		default :
			System.out.println("다시 입력하세요.");
			break;
		}
		
		// else_if 로 달력만들기
		System.out.println("-------else_if-------");
		
		if((month == 1)||(month == 3)||(month == 5)||(month == 7)||(month == 8)||(month == 10)||(month == 12)) {
			System.out.println(month + "월은 31일까지 있습니다.");
		} else if((month == 4)||(month == 6)||(month == 9)||(month == 11)) {
			System.out.println(month + "월은 30일까지 있습니다.");
		} else if (month == 2) {
			System.out.println(month + "월은 28일까지 있습니다.");
		} else {
			System.out.println("다시 입력하세요.");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
