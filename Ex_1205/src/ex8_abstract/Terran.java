package ex8_abstract;

public class Terran extends Unit{

	
	

	public Terran(String name, int energy, boolean fly) {
		super();
		super.name = name;
		super.energy = energy;
		super.fly = fly;
	}

	@Override
	public void decEnergy() {
		energy -= 3;
	}
}
