package ex2_map;

import java.util.HashMap;
import java.util.Scanner;

public class Ex2_Map {

	public static void main(String[] args) {
		
		/*
		 * id : aaa
		 * pw : 1234
		 * ���̵� �������� �ʽ��ϴ�.
		 * 
		 * id : lee
		 * pw : 3333
		 * ��й�ȣ�� ��ġ���� �ʽ��ϴ�.
		 * 
		 * id : park
		 * pw : 3333
		 * �α��� ����!
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
			System.out.println(id + " �� �ȳ��Ͻ�! �α��� ����!");
			} else {
			System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			}
			
		} else {
			System.out.println("���̵� �������� �ʽ��ϴ�.");
		}
		
	}

}
