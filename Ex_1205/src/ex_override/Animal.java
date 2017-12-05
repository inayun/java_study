package ex_override;

public class Animal {

	//모든 동물들이 갖는 공통적인 특징
	private int leg; //다리
	private String shout; //소리
	
	public int getLeg() {
		return 4;
	}
	public String getShout() {
		return shout;
	}
	public void setShout(String shout) {
		this.shout = shout;
	}
	
	
}
