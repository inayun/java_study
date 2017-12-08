package ex1_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class Ex_Set {
	public static void main(String[] args) {


		/*
		 * set은 java.util 패키지 안에 존재하는 인터페이스
		 * 특정 코드에서 '중복된 값을 허용해서는 안될때' 사용! 중복x 중복x
		 * 인덱스 없음! 
		 * 가장 많이 사용하는 HashSet과 TreeSet 클래스가 존재
		 * 
		 * add되는 값이 '한자리' 정수면 '자동으로 정렬'이 됨
		 */

		HashSet<Integer> hs = new HashSet();
		HashSet<User> hu = new HashSet();

		while(true) {
			int r = new Random().nextInt(45) + 1;
			hs.add(r);

			if(hs.size() ==6)
				break;

		} //while	
		
		User user = new User();
		user.setId("aaa");
		user.setPwd(1111);
		hu.add(user);
		
		//User user2 = new User();
		user.setId("aaa");
		user.setPwd(1111);
		hu.add(user);
		
		System.out.println("----------hu------------");
		System.out.println();

		User[] arr = new User[hu.size()];
		Iterator<User> all = hu.iterator();
		
		for( int i = 0; i<hu.size(); i++) {
			arr[i] = all.next();
			System.out.println(arr[i].getId());
			System.out.println(arr[i].getPwd());

		}
		
		
		
		System.out.println(hs);
		System.out.println("----------------------");
		
		
		
		
		
		
		
		
		
		/*
		 * TreeSet
		 * 자동 정렬가능!!!!!!!!!!!!!!!!!!
		 */
		TreeSet<Integer> ts = new TreeSet();
		
		while(true){
			int r = new Random().nextInt(45) + 1;
			ts.add(r);
			
			if(ts.size() ==6)
				break;
		}
		System.out.println(ts);
		/*
		 * subSet을 통해서 일정 범위의 값을 가려낼 수 도 있음
		 * 10~30까지 범위내의 수 뽑기
		 */
		System.out.println(ts.subSet(10, 30));
		
	}
}
