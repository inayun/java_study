package ex5_work;

public class ShowGraph {
	
	public void ShowGraph(int[] count) {
		
		for(int i = 0; i < count.length; i++) {
			System.out.print(i + "ÀÇ °¹¼ö : ");
			
			for(int j = 0; j < count[i]; j++) {
				System.out.print("#");
			}
			System.out.println(" "+ count[i]);
		}
	}
}
