package ex3_sort;

import java.util.Comparator;

public class NameDescCompare implements Comparator<User>{


	@Override
	public int compare(User a0, User a1) {
		//���� �������� 
		return a1.getName().compareTo(a0.getName());
	}
}
