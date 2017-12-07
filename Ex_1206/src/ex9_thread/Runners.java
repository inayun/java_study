package ex9_thread;

import java.util.Random;

public class Runners {
	public static void main(String[] args) {

		int[] playerRandom = new int[4];
		String[] playerJump = new String[playerRandom.length];

		for(int i = 0; i < playerJump.length; i ++) {
			playerJump[i] = "";
		}

		boolean finish = false; //기본값은 false
		int finishPlayer = 0; //1등한 선수 번호

		while(true) {
			//달릴 거리를 랜덤으로 지정
			for(int i = 0; i <playerRandom.length; i++) {
				playerRandom[i] = new Random().nextInt(3);
			}


			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			//위에서 발생시킨 난수를 가지고 각 선수별 도약 거리를 적용

			for(int i = 0; i < playerJump.length; i++) {

				switch(playerRandom[i]) {

				case 0 :
					playerJump[i] += "";
					break;

				case 1 :
					playerJump[i] += " ";
					break;

				case 2 :
					playerJump[i] += "  ";
					break;

				}//switch
			}

			System.out.println("-----------------------------------------------------------------------------------------------------");

			for(int i = 0; i < playerJump.length; i++) {
				System.out.print(playerJump[i]);
				System.out.println(i + 1 +"옷");
				
				if(playerJump[i].length() >= 50) {
					finishPlayer = i + 1;
					finish = true;
				}
					
			} //for
			
			System.out.println("-----------------------------------------------------------------------------------------------------");

			if(finish) {
				System.out.println("win - " + finishPlayer);
				break;
			}

		} //true


	}
}
