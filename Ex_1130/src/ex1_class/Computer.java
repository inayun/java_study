package ex1_class;

public class Computer {

	/*
	 * 컴퓨터를 대량생산 하기 위한 설계도 작성
	 */
	
	// 변수, 멤버, 속성
	int hdd = 200;
	int ram = 512;
	float cpu = 2.5f;
	String color = "검정";
	
	//메서드 , 기능, 함수 
	public void getInfo() {
		System.out.println("HDD : " + hdd + "GB");
		System.out.println("RAM : " + ram + "GB");
		System.out.println("CPU : " + cpu + "GHz");
		System.out.println("COLOR : " + color);
	}
	
	/*메서드의 구성
	 * 접근제한  반환형 메서드명 (파라미터){메서드 실행영역}
	 * public void getInfo() {}
	 * 
	 * 접근제한자
	 * public : 같은 프로젝트 내의 모든 클래스에서 사용을 허가
	 * private : 현재 클래스에서만 사용을 허가
	 * protected : 상속관계의 객체들만 사용을 허가
	 * default : 같은 패키지의 클래스에서 사용을 허가 (생략)
	 * 
	

	 */
}
