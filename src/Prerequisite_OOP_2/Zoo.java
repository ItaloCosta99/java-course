package Prerequisite_OOP_2;

public class Zoo {
	public static void main(String[] agrs) {

		// Animal animal1 = new Animal(12, "M", 23);

		// animal1.eat();

		Bird bird1 = new Bird(3, "F", 10);

		bird1.eat();
		bird1.sleep();

		Chicken chick1 = new Chicken(3, "F", 7);

		Sparrow sparrow1 = new Sparrow(1, "M", 4);
		sparrow1.move();

		Fish fish1 = new Fish(1, "M", 2);
		fish1.move();

		moveAnimal(fish1);
		moveAnimal(sparrow1);

		Flyable flyingBird = new Sparrow(1, "M", 32);
		flyingBird.fly();
	}

	public static void moveAnimal(Animal animal) {
		animal.move();
	}
}
