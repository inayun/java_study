package ex6_generic;

public class Generic {
	
	/*
	 * 클래스에 제네릭타입을 달지 않고
	 * 메서드에 적용을 하면
	 * 
	 * 클래스 객체를 타입마다 여러개 만들지 않고
	 * 한 클래스객체를 가지고
	 * 메서드 타입만 다르게 사용할 수 있음
	 * 
	 * 메모리낭비. 속도면에서 더 효율적
	 */
	public <T> void printArray(T n[]) {
		
		for(int i = 0; i < n.length; i++) {
			System.out.print(n[i]+"");
		}
		System.out.println();
	}
}
