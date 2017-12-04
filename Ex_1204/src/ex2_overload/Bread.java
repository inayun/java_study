package ex2_overload;

public class Bread {

	public void makeBread() {
		System.out.println("빵을 만들었습니다.");
	}
	
	public void makeBread(int num) {
		
		for(int i = 0; i <num; i++) {
			System.out.println("빵을 만들었습니다.");
		}
		System.out.printf("요청하신 %d개의 빵을 만들었습니다.\n",num);	
			
	}

	public void makeBread(int num, String name) {
		for(int i = 0; i <num; i++) {
			System.out.printf("%s빵을 만들었습니다.\n",name);
		}
		System.out.printf("요청하신 %d개의 %s빵을 만들었습니다.\n",num,name);
}
	
}
