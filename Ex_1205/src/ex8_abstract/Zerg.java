package ex8_abstract;

public class Zerg extends Unit{

	public Zerg(String name, int energy, boolean fly) {
		super.name = name;
		super.fly = fly;
		super.energy = energy;
	}

	@Override
	public void decEnergy() {
		energy -= 10;
	}
}
