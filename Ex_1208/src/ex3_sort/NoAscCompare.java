package ex3_sort;

import java.util.Comparator;

public class NoAscCompare implements Comparator<User> {

	@Override
	public int compare(User a0, User a1) {
		//숫자 오름차순 
		return a0.getNo() < a1.getNo() ?
				-1 : a0.getNo() > a1.getNo() ? 1 : 0;
	}
}
