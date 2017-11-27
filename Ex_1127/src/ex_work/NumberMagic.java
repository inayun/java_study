package ex_work;

import java.util.Scanner;

public class NumberMagic {

	public static void main(String[] args) {
		
		int result = 0;
		int answer = 0;
		Scanner scanner = new Scanner( System.in );
		
		System.out.println("04 05 06 07 12 13 14 15 20 21 22 23 28 29 30");
		System.out.print("여기에 생각한 숫자가 있습니까? (있으면 1, 없으면 2) : ");
		answer = scanner.nextInt();
		
		if (answer == 1) {
			result += 4;
		} 
		System.out.println("16 17 18 19 20 21 22 23 24 25 26 27 28 29 30");
		System.out.print("여기에 생각한 숫자가 있습니까? (있으면 1, 없으면 2) : ");
		answer = scanner.nextInt();
		
		if (answer == 1) {
			result += 16;
		} 
		System.out.println("01 03 05 07 09 11 13 15 17 19 21 23 25 27 29");
		System.out.print("여기에 생각한 숫자가 있습니까? (있으면 1, 없으면 2) : ");
		answer = scanner.nextInt();
		
		if (answer == 1) {
			result += 1;
		}
		System.out.println("08 09 10 11 12 13 14 15 24 25 26 27 28 29 30");
		System.out.print("여기에 생각한 숫자가 있습니까? (있으면 1, 없으면 2) : ");
		answer = scanner.nextInt();
		
		if (answer == 1) {
			result += 8;
		}
		System.out.println("02 03 06 07 10 11 14 15 18 19 22 23 26 27 30");
		System.out.print("여기에 생각한 숫자가 있습니까? (있으면 1, 없으면 2) : ");
		answer = scanner.nextInt();
		
		if (answer == 1) {
			result += 2;
		} 
		
		if (result <= 0 || result > 30) {
			System.out.println("수가 올바르지 않습니다.");
		} else {
		System.out.println(result);
		}
		scanner.close();
	}

}
