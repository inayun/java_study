package ex_while;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Ex2_While {

	public static void main(String[] args) {

		int num1 = 1;
		int num2 = 2;
		
		while ( num1 <= 5 ) {
			System.out.printf("%d = " , num1++);
			
			for ( int i = 1; i <= 5; i++) {
				System.out.printf("%d ", num2++);
			}
			
			System.out.println();
		}
	}

}
