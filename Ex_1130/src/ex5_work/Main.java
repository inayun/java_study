package ex5_work;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		
		int[][] count = new int[10][1];
		int num = 0;
		count[num][0] = 0;
		ShowGraph sg = new ShowGraph();
		
		for( int i = 0; i < 100; i++ ) {
			num = new Random().nextInt(10);
			count[num][0] ++;
		}
		for(int i = 0; i < count.length; i++) {
			System.out.print(i + "ÀÇ °¹¼ö : ");
			sg.ShowGraph(i,count[i][0]);
		}
	}
}
