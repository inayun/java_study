package ex1_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class Ex_Set {
	public static void main(String[] args) {


		/*
		 * set�� java.util ��Ű�� �ȿ� �����ϴ� �������̽�
		 * Ư�� �ڵ忡�� '�ߺ��� ���� ����ؼ��� �ȵɶ�' ���! �ߺ�x �ߺ�x
		 * �ε��� ����! 
		 * ���� ���� ����ϴ� HashSet�� TreeSet Ŭ������ ����
		 * 
		 * add�Ǵ� ���� '���ڸ�' ������ '�ڵ����� ����'�� ��
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
		 * �ڵ� ���İ���!!!!!!!!!!!!!!!!!!
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
		 * subSet�� ���ؼ� ���� ������ ���� ������ �� �� ����
		 * 10~30���� �������� �� �̱�
		 */
		System.out.println(ts.subSet(10, 30));
		
	}
}
