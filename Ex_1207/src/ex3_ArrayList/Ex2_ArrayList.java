package ex3_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Ex2_ArrayList {

	public static void main(String[] args) {

		List<String> list = new ArrayList();
		list.add("ȫ�浿");
		list.add("����浿");
		list.add("����浿");
		list.add("���ñ浿");
		
		list.set(1,"��浿"); //�ε��� 1���� ����浿 -> ��浿
		
		for(int i = 0; i <list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
