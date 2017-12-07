package ex3_ArrayList;

import java.util.ArrayList;

public class Ex1_ArrayList {

	/*
	 * ArrayList
	 * 자동 정렬은 안해주는데
	 * 인덱스는 있움
	 * 
	 */
	
	 public static void main(String[] args) {
		
		 ArrayList<Integer> list = new ArrayList();
		 //List<Integer> list = new ArrayList();
		 
		 list.add(100);
		 list.add(200);
		 list.add(300);
		 
		 //특정 '인덱스'를 제거
		 list.remove(1); // 200이 지워짐 [ 100, 300 ]
		 //특정 인덱스에 값을 집어넣음
		 list.add(1,400); //[100, 400, 300]
		 list.add(0,300);
		 //set은 해당 인덱스의 값을 '교체'하는 것
		 list.set(2,500);
		 
		 System.out.println(list);
	}
	
}
