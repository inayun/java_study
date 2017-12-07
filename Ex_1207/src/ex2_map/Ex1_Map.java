package ex2_map;

import java.util.HashMap;

public class Ex1_Map {

	public static void main(String[] args) {

		/*
		 * 
		 * Map은 키(key)와 값(value)으로 구성. 묶어서 하나의 데이터로 저장
		 * key를 통해 value를 검색할 수 있으므로
		 * 많은 양의 데이터를 검색하는데 뛰어난 성능을 발휘
		 * 인덱스 없음!
		 * 
		 * set,arraylist...... - add
		 * map - put (put은 무조건 map만 사용함!! I say 'map' you say 'put')
		 */
		
		HashMap<String,Integer> map1 = new HashMap();
		map1.put("이정훈",29);
		map1.put("이정훈",25);

		//키값이 같으면 마지막 값으로 됨
		int result = map1.get("이정훈");
		System.out.println(result);
		
		HashMap<Integer,Integer> map2 = new HashMap();
		map2.put(0, 100);
		map2.put(1, 200);
		map2.put(2, 300);
		
		//특정 키를 포함하고 있는지 검사
		if(map2.containsKey(3)) {
			System.out.println(map2.get(2));
		} else {
			System.out.println("없음");
		}
		
	}

}
