package ex_string;

public class Ex2_String_Method {

	public static void main(String[] args) {

		//모든 메소드는 소괄호를 가지고 있음
		String str = "Hong Gil Dong";
		System.out.println("str의 길이 : " + str.length()); // 13
		
		//맨 처음 g의 위치 
		int index = str.indexOf('g');
		System.out.println(index);
		
		//맨 마지막 g의 위치
		index = str.lastIndexOf('o');
		System.out.println(index);

		//Gil이란 단어의 시작위치
		index = str.indexOf("Gil");
		System.out.println(index);
		
		//해당 인덱스에서 추출한 문자
		char c = str.charAt(5);
		System.out.println(c);
		
		String str2 = str.substring(1,7);
		System.out.println(str2);
		
		//equals 는 대소문자 구분함! => equalsIgnoreCase 대소문자 무시
		String test = "Apple";
		if(test.equalsIgnoreCase("apple")) {
			System.out.println("값이 같습니다.");
		}
		
		String name = " 홍길동 ";
		String name2 = name.trim(); //문장 앞뒤의 의미없는 공백 제거
		System.out.println(name.length()); //5개...
		System.out.println(name2.length()); //3개
		
		//정수형태의 문자열을 실제 정수로 바꿔주는 메서드(기능) 
		String number = "100";
		int n = Integer.parseInt(number);
		
				
		
	}

}
