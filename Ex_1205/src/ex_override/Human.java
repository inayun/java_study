package ex_override;

public class Human extends Animal{

	String tool = "����";
	
	@Override
	public int getLeg() {
		return 2;
	}
}
