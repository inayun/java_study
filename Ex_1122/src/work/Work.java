package work;

public class Work {

	public static void main(String[] args) {

		/*
		 * 
		 * 과수원이 있다.
		 * 배, 사과, 오렌지를 키우고 있는데
		 * 하루에 생산되는 과일의 양은 각각 5, 7, 5개,
		 * 
		 * 과수원에서 하루에 생산되는 과일의 총 갯수를 출력.
		 * 시간당 전체 과일의 평균 생산 갯수를 출력.
		 * 
		 * 단, 각각 과일의 갯수와  총 갯수를 담을 변수는  int로,
		 * 평균 생산 갯수를 담을 변수는 float 으로 만든다
		 * 
		 */
		
		int pear = 5;
		int apple = 7;
		int orange = 5;
		int totalFruit = pear + apple + orange;
		float averageFruit1 = totalFruit / 24f;
		float averageFruit2 = (float)totalFruit/24;
		
		//소수점 뒤에 몇자리 까지 출력
		System.out.println("하루에 생산되는 과일의 총 갯수: " + totalFruit);
		System.out.printf("시간 평균 : %.2f개",averageFruit1); //두자리까지 출력
		System.out.println();
		System.out.println("시간당 전체 과일의 평균 생산 갯수: " + averageFruit1);
		System.out.println("시간당 전체 과일의 평균 생산 갯수: " + averageFruit2);

	}

}
