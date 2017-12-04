package ex7_tour;

import java.util.Scanner;

public class Tour {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("관광객수 : ");
		int n = scanner.nextInt();
		
		Guide guide = new Guide(n);
		System.out.println("관광객 등록");
		
		for(int i = 0; i < guide.guest.length; i++) {
			System.out.print("이름 : ");
			guide.guest[i].setName(scanner.next());
			System.out.print("성별 : ");
			guide.guest[i].setGender(scanner.next());
			System.out.print("나이 : ");
			guide.guest[i].setAge(scanner.nextInt());
			System.out.println("-----------");
		}
		
		outer : while(true) {
			System.out.println("1. 관광객 정보");
			System.out.println("2. 목적지 변경");
			System.out.println("etc.종        료");
			
			int select = scanner.nextInt();
			
			
			
			switch(select) {
			
			case 1 : //관광지 정보 
				
				for(int i = 0; i < guide.guest.length; i++) {
					
					System.out.println("이름 : " + guide.guest[i].getName());
					System.out.println("성별 : " + guide.guest[i].getGender());
					System.out.println("나이 : " + guide.guest[i].getAge());
					System.out.println("목적지 : " + guide.guest[i].getPoint());
					System.out.println("------------------");
				}
				
				break;
				
			case 2 : //목적지 변경
				
					System.out.print("목적지 변경 장소 : ");
					Guide.point= scanner.next();
					
				break;
				
			default : //종료
				System.out.println("종료");
				break outer;
			
			}
		}
	}

}
