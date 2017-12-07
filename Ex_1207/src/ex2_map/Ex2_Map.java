package ex2_map;

import java.util.HashMap;
import java.util.Scanner;

public class Ex2_Map {

	public static void main(String[] args) {
		
		/*
		 * id : aaa
		 * pw : 1234
		 * 아이디가 존재하지 않습니다.
		 * 
		 * id : lee
		 * pw : 3333
		 * 비밀번호가 일치하지 않습니다.
		 * 
		 * id : park
		 * pw : 3333
		 * 로그인 성공!
		 */
		
		
		HashMap<String, Integer> map = new HashMap();
		map.put("kim", 1111);
		map.put("lee", 2222);
		map.put("park", 3333);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("id : ");
		String id = scanner.next();
		System.out.print("pw : ");
		int pw = scanner.nextInt();
		
		if(map.containsKey(id)) {
			
			if(map.get(id) == pw) {
			System.out.println(id + " 님 안녕하슈! 로그인 성공!");
			} else {
			System.out.println("비밀번호가 일치하지 않습니다.");
			}
			
		} else {
			System.out.println("아이디가 존재하지 않습니다.");
		}
		
	}

}
