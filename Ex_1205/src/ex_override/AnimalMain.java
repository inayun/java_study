package ex_override;

public class AnimalMain {
	
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		System.out.println(dog.nose);
		System.out.println(dog.getLeg());
		System.out.println("----------------");
		
		Bear bear = new Bear();
		System.out.println(bear.woong);
		System.out.println(bear.getLeg());
		System.out.println("----------------");

		Snake snake = new Snake();
		System.out.println(snake.tongue);
		System.out.println(snake.getLeg());
		System.out.println("----------------");

		Human human = new Human();
		System.out.println(human.tool);
		System.out.println(human.getLeg());
	}
}
