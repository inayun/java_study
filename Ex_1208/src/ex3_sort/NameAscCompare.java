package ex3_sort;

import java.util.Comparator;

public class NameAscCompare implements Comparator<User>{

	@Override
	public int compare(User a0, User a1) {
		//문자 오름차순 
		return a0.getName().compareTo(a1.getName());
	}
}
