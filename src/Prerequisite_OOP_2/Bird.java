package Prerequisite_OOP_2;

public class Bird extends Animal {
	
	public Bird(int age, String gender, int weightInLbs) {
		super(age, gender, weightInLbs);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Flapping wings...");
	}
}
