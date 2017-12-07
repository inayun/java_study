package ex2_map;

import java.util.HashMap;

public class Ex1_Map {

	public static void main(String[] args) {

		/*
		 * 
		 * Map�� Ű(key)�� ��(value)���� ����. ��� �ϳ��� �����ͷ� ����
		 * key�� ���� value�� �˻��� �� �����Ƿ�
		 * ���� ���� �����͸� �˻��ϴµ� �پ ������ ����
		 * �ε��� ����!
		 * 
		 * set,arraylist...... - add
		 * map - put (put�� ������ map�� �����!! I say 'map' you say 'put')
		 */
		
		HashMap<String,Integer> map1 = new HashMap();
		map1.put("������",29);
		map1.put("������",25);

		//Ű���� ������ ������ ������ ��
		int result = map1.get("������");
		System.out.println(result);
		
		HashMap<Integer,Integer> map2 = new HashMap();
		map2.put(0, 100);
		map2.put(1, 200);
		map2.put(2, 300);
		
		//Ư�� Ű�� �����ϰ� �ִ��� �˻�
		if(map2.containsKey(3)) {
			System.out.println(map2.get(2));
		} else {
			System.out.println("����");
		}
		
	}

}
