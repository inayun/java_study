package ex4_work;

public class Cal {

	public int getResult(int num1, int num2, String opp) {
		
		int result = 0;
		
		switch(opp) {
		
		case "+":
			result = num1 + num2;
			break;
			
		case "-":
			result = num1 - num2; 
			break;
		
		case "*":
			result = num1 * num2; 
			break;
			
		case "/":
			result = num1 / num2; 
			break;
				
		}
		return result; 
	}
	
}
