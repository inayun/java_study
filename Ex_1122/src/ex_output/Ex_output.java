package ex_output;

public class Ex_output {

	public static void main(String[] args) {

		int age = 21;
		System.out.println("저의 나이는" + age + "세 입니다");
		
		System.out.printf("제 나이는  %d입니다. 동생은 %d 입니다.", age, age);
		
		System.out.println();
		// 정수는 무조건  d (long, short, byte...)
		System.out.printf("사과%d, 귤%d, 포도%d : 마시썽", 1,2,3);
		
		System.out.println();
		// 실수는 무조건 f (double...)
		System.out.printf("원주율은 %f", 3.14);
		
		System.out.println();
		// 문자는 c
		System.out.printf("문자  %c", 'A');

		// 문자열은 s
	}

}
