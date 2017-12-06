package ex2_try_catch;

public class Ex2_TryCatch {

	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30};
		
		
		
		for(int i = 0; i <= arr.length; i++) {
			
			try {
			System.out.println(arr[i]);
			} catch(Exception e) {
				
			}
			
			
		}
		
		
		System.out.println("프로그램 끝");
	}
}
