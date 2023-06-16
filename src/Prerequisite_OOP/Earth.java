package Prerequisite_OOP;

public class Earth {
	public static void main(String args[]) {
		Human human1 = new Human("Tom", 13, 76, "Blue");
		Human human2 = new Human("Mike", 13, 76, "Blue");

		human1.speak();
		human2.speak();
	}
}
