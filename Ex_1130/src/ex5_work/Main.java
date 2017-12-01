package ex5_work;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		
		int[] count = new int[10];
		ShowGraph sg = new ShowGraph();
		
		for( int i = 0; i < 100; i++ ) {
			int num = new Random().nextInt(10);
			count[num] ++;
		}
		sg.ShowGraph(count);
	}
}
