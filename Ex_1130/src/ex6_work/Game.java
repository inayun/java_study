package ex6_work;

import java.util.Random;

public class Game {

	int random = new Random().nextInt(50)+1;
	int result = 0;
	
	public int check(int input) {
		
		if(input > random) {
				result =  0; //down
				System.out.println("DOWN! ");
		} else if(input < random){
				result =  1; //up
				System.out.println("UP!");
		} else {	
				result = 2; //correct
				System.out.println("정답입니다.");
		}	
		return result;
	}
}
