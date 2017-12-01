package ex_object_array;

public class ArrayMain {

	public static void main(String[] args) {

		
		ArrayTest[] at = new ArrayTest[2];
		/*at[0] = new ArrayTest();
		at[1] = new ArrayTest();*/
		
		for(int i = 0; i < at.length; i++) {
			at[i] = new ArrayTest();
		}
		
		at[0].setAge(20);
		at[0].setName("È«±æµ¿");
		
		at[1].setAge(30);
		at[1].setName("±è±æµ¿");
		
		for(int i = 0; i < at.length; i++) {
			System.out.println(at[i].getAge());
			System.out.println(at[i].getName());
		}
	}

}
