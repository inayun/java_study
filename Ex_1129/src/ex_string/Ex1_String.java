package ex_string;

import java.util.Scanner;

public class Ex1_String {

	public static void main(String[] args) {

		/*
		 * 클래스중에서 대표적이라고 할 수 있는 String클래스
		 * 
		 * String 클래스는 두가지의 특징이 있음
		 * 1) 객체 생성법 2가지  : 암시적, 명시적
		 * 2) 한번 생성된 문자열의 내용은 변하지 않음 (불변적 특징)
		 * 
		 */
		
		//클래스(new)를 통해 만들어진 변수 = 객체라고 함
		//heap 에 생성하고 stack에서 참조하는 것들 = 객체
		// 일반 '자료형' 객체 생성은 객체를 암시적으로 생성함
		String s1 = "abc";
		String s2 = "abc";
		
		//------'암시적' 객체 생성
		//'클래스'들은 ==로 비교하면 값을 비교하는게 아니라 주소를 비교함!!!!!
		if( s1 == s2 ) {
			System.out.println("주소가 같음");
		} else {
			System.out.println("주소가 다름");
		}
		
		//new 키워드가 사용되면 '명시적' 객체 생성
		//명시적으로 객체를 생성하면 heap에 같은 값이 있더라도 무조건 새로 만듦
		String s3 = new String("abc");
		String s4 = new String("abc");
		
		if( s4 == s3 ) {
			System.out.println("주소가 같음");
		} else {
			System.out.println("주소가 다름");
		}
		
		
		Scanner scanner = new Scanner(System.in);
		String s5 = scanner.next();
		
		System.out.println("------주소 비교---------");
		if(s5 == "y") { //y가 아닙니다
			System.out.println("y입니다");
		} else {
			System.out.println("y가 아닙니다");
		}
		System.out.println("-------값 비교--------");
		if(s5.equals("y")) {
			System.out.println("y입니다.");
		} else {
			System.out.println("y가 아닙니다");
		}

		//힙에 가비지 컬렉터가 상주하면서 낭비되는 것들을 버림
		//홍길동 / 홍길동안녕   / 홍길동 안녕하세요 => 힙에 공간이 3개 \생김
		String msg = "홍길동";
		msg += " 안녕";
		System.out.println(msg +  "하세요");
	}

}
