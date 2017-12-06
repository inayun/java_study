package ex2_try_catch;

public class Ex1_TryCatch {
	public static void main(String[] args) {
		
		/*
		 * Try-Catch 예외처리
		 * 자바에서 프로그램이 실행되는 도중 
		 * 예외가 발생하면
		 * 그 시점에서 프로그램이 강제적으로 종료된다
		 * 
		 * 이것은 올바른 판단이지만,
		 * 때로는 예상할 수 있는 가벼운 오류가 있거나
		 * 예외 발생시에도 강제종료 하지 않고
		 * 이후의 작업물을 확인하고자 할때가 있음
		 * 
		 * 예외 처리를 통해
		 * 프로그램의 비정상적인 종료를 줄이고
		 * 정상적으로 프로그램이 계속 진행될 수 있도록 함
		 */
		
		int n = 2;
		int result = 0;
		
		try {
			result = 10 / n ;
			
			String str = "홍길동";
			str.charAt(3);
			
			//try문안에서 예외가 발생하면 catch로 들어감
		} catch(ArithmeticException e) {
			//Exception 예외처리계의 부모
			
			n = 1; //(오류에 대한 해결책을 정의해줄 수 도 있음
			System.err.println("0으로는 나눌 수 없습니다.");
			//e.printStackTrace();
			
			
			//예외처리 종류마다 다 정의해줄 수 있음 
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("없는방");
		} finally {
			//예외가 발생하든 안하든 무조건 들렀다가 나옴
			System.out.println("end");
		}
		
		System.out.println(result);
		//ArithmeticException : 정수를 0으로 나눌때 발생되는 오류
		
		
		
	}
}
