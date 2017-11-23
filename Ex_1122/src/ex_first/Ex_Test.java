package ex_first;

public class Ex_Test {

	public static void main(String[] args){
		
		// main 메소드 : 컴파일시에 가장 먼저 호출되는 영역
		
		System.out.println("hi");
		System.out.println("안뇽");
		//string 앞의 숫자들은 연산됨
		System.out.println(20 + 20 + "500");
		//string 뒤부터는 모든 숫자들이 연결로 작용됨 (연산 x)
		System.out.println("500" + 20 + 20); 
		//string 뒤의 숫자들이 연산되려면 괄호안에 넣어줘야함
		System.out.println("500" + (20 + 20));
		//숫자들을 그냥 연결하고 싶을 경우에는 앞에 빈 스트링 넣어주면 됨
		System.out.println("" + 20 + 20);

		

	}
	
	
}
