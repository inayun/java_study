package gamble_game;

public class UserInterFace implements Runnable{
	

	char backBoard [][] ;
	String information [] ;
	char point = '?';
	int x = 0;
	int y = 1;
	
	
	public UserInterFace(int x, int y) {
		
		
		this.x = (x/3)*2;
		backBoard = new char [x][y];
			for (int i = 0; i < backBoard.length; i++) {
				for (int j = 0; j < backBoard[i].length; j++) {
					if (i == 0 || i == backBoard.length-1) {
						backBoard[i][j] = '=';
					}else if(j == 0 || j == 1 || j == backBoard[i].length-1 || j == backBoard[i].length-2){
						backBoard[i][j] = '|';
					}else {		
						backBoard[i][j] = ' ';
					}
				}
			}
	}
	/*= { //Graph Range =  backBoard[1][2] ~ backBoard[18][50]
			//     "01234567890123456789012345678901234567890123456789012"  
				   "=====================================================", //0
				   "||'''''''''''''''''''''''''''''''''''''''''''''''''||", //1
			       "||'''''''''''''''''''''''''''''''''''''''''''''''''||", //2
			       "||'''''''''''''''''''''''''''''''''''''''''''''''''||", //3
			       "||'''''''''''''''''''''''''''''''''''''''''''''''''||", //4
			       "||'''''''''''''''''''''''''''''''''''''''''''''''''||", //5
			       "||'''''''''''''''''''''''''''''''''''''''''''''''''||", //6
			       "||'''''''''''''''''''''''''''''''''''''''''''''''''||", //7
			       "||'''''''''''''''''''''''''''''''''''''''''''''''''||", //8
			       "||'''''''''''''''''''''''''''''''''''''''''''''''''||", //9
			       "||'''''''''''''''''''''''''''''''''''''''''''''''''||", //10
			       "||'''''''''''''''''''''''''''''''''''''''''''''''''||", //11
			       "||'''''''''''''''''''''''''''''''''''''''''''''''''||", //12
			       "||'''''''''''''''''''''''''''''''''''''''''''''''''||", //13
			       "||'''''''''''''''''''''''''''''''''''''''''''''''''||", //14
			       "||'''''''''''''''''''''''''''''''''''''''''''''''''||", //15
			       "||'''''''''''''''''''''''''''''''''''''''''''''''''||", //16
			       "||'''''''''''''''''''''''''''''''''''''''''''''''''||", //17
			       "||?''''''''''''''''''''''''''''''''''''''''''''''''||", //18
			       "====================================================="	//19
				};*/
	
	public void clearAll() {
		String intro2 [] = {"                                                     ",
				   "                                                     ",
			       "                                                     ",
			       "                                                     ",
			       "                                                     ",
			       "                                                     ",
			       "                                                     ",
			       "                                                     ",
			       "                                                     ",
			       "                                                     ",
			       "                                                     ",
			       "                                                     ",
			       "                                                     ",
			       "                                                     ",
			       "                                                     ",
			       "                                                     ",
			       "                                                     ",
			       "                                                     ",
			       "                                                     ",
			       "                                                     ",
			       "                                                     ",
			       "                                                     ",
			       "                                                     ",
			       "                                                     ",
			       "                                                     ",
			       "                                                     ",
			       "                                                     ",
			       "                                                     ",
			       "                                                     "
		};
		for (int i = 0; i < intro2.length; i++) {
			System.out.println(intro2[i]);
		}
	}
	public void ShowStart() {

		String intro [] = {"=====================================================",
					       "||'''''''''''''''''''''''''''''''''''''''''''''''''||",
					       "||'''''''''''''''''''''''''''''''''''''''''''''''''||",
					       "||''''''''''''''''공포의 ''주식 ''롤러코스터'''''''''''''''||",
					       "||'''''''''''''''''''''''''''''''''''''''''''''''''||",
					       "||'''''''''''''''''''''''''''''''''/'''''''''''''''||",
					       "||''''''''''''''''''''''''__''''''/''''''''''''''''||",
					       "||'''''''''''''''''''''''/''\\''''/'''''''''''''''''||",
					       "||''''''''''''''''''''__/''''\\''/''''''''''''''''''||",
					       "||'''''''''''''''''''/''''''''\\/'''''''''''''''''''||",
					       "||''''''''''''''''''/''''''''''''''''''''''''''''''||",
					       "||'''''''''''''''''''''''''''''''''''''''''''''''''||",
					       "||'''''''''''''''''''''''''''''''''''''''''''''''''||",
					       "||'''''''''''''press [enter] to start''''''''''''''||",
					       "||'''''''''''''''''''''''''''''''''''''''''''''''''||",
					       "||'''''''''''''''''''''''''''''''''''''''''''''''''||",
					       "||'''''''''''''''''''''''''''''''''''''''''''''''''||",
					       "||'''''''''''''''''''''''''''''''''''''''''''''''''||",
					       "||'''''''''''''''''''''''''''''''''''''''''''''''''||",
					       "====================================================="
		};	
			for (int i = 0; i < intro.length; i++) {
				System.out.println(intro[i]);
			}		
	}
	
	
	public void changeStockState(int x) {
		this.y++;
		if ( x > 0) {
			this.x--;
			point = '/';
		}else if(x == 0) {
			point = '-';
		}else if(x < 0) {
			this.x++;
			point = '\\';
		}
		backBoard [this.x][y] = point;
	}
	
	public void showStockGraph() {
		
		clearAll();
		for (int i = 0; i < backBoard.length; i++) {
			System.out.print(backBoard[i]);
			System.out.print("       ");
			if(i == backBoard.length/3) {
				System.out.print(">목표 금액 :	"+Market.goal);
			}else if(i == backBoard.length/3+1) {
				System.out.print(">내        돈:       "+User.balance);
			}else if(i == backBoard.length/3+2) {
				System.out.print(">채        권:       "+Market.tray);
			}
			System.out.println();
		}
	}
	
	public void showResult() {
		if (Market.goal > Market.tray+Market.user.getBalance()) {
			System.out.println("                          ");
			System.out.println("          ㅠ   ㅠ                   ");
			System.out.println("            ㅡ                      ");
			System.out.println("                          ");
			System.out.println("        실           패               ");
		}else {
			System.out.println("                          ");
			System.out.println("          ㅅ   ㅅ                   ");
			System.out.println("            ㅇ                      ");
			System.out.println("                          ");
			System.out.println("        성           공               ");
		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
