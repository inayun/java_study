package ex1_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Ex2_Set {
	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet();
		
		for(int i = 0; hs.size() < 5; i++) {
			int r = new Random().nextInt(100)+1;
			hs.add(r);
		}
		System.out.println(hs);
		
		//set구조의 내용을 index없이 순차적으로 얻어오기 위해 Iterator 라는 반복자를 사용
		int[] arr = new int[hs.size()];
		int i = 0;
		
		Iterator<Integer> all = hs.iterator();
		
		for(int k = 0; k < arr.length; k++) {
			arr[k] = all.next();
			System.out.print(arr[k] + " ");
		}
		
		
		/* 방법2
		 
		while(all.hasNext()) {
			int num = all.next();
			arr[i] = num;
			i++;
		}*/
		
	}
	
}
