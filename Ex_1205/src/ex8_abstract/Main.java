package ex8_abstract;

public class Main {
	public static void main(String[] args) {
		
		Terran t1 = new Terran("�غ�", 100, false);
		Terran t2 = new Terran("�Ƿἱ",150, true );
		
		t1.decEnergy();
		t2.decEnergy();
		
		System.out.println(t1.getEnergy());
		System.out.println(t2.getEnergy());
		
		System.out.println("------------");
		
		Zerg z1 = new Zerg("�����",200,false);
		z1.decEnergy();
		System.out.println(z1.getEnergy());
		
		System.out.println("------------");
		Protoss p1 = new Protoss("�Ž�", 250, false);
		p1.decEnergy();
		System.out.println(p1.getEnergy());
	}
}
