package ex3_work;

import java.util.Scanner;

public class TimesTableMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("출력할 단 : ");
		int num = scanner.nextInt();
		
		TimesTable tt = new TimesTable();
		tt.showTable(num);
	}

}
