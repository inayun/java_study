package ex8_abstract;

public class Protoss extends Unit{

	public Protoss(String name, int energy, boolean fly) {
		super.name = name;
		super.fly = fly;
		super.energy = energy;
	}
	
	
	@Override
	public void decEnergy() {
		energy -= 1;
	}

	
}
