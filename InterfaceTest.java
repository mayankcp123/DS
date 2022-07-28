public class InterfaceTest {

	public static void main(String[] args) {

		Children ch = new Children();
		Boy b = new Boy();
		ch.cry();
		ch.play();
		ch.sleep();
		b.study(5);
		b.play();

	}

}

interface Playing {
	public void play();
}

interface Crying {
	public void cry();
}

interface Sleeping {
	public void sleep();
}

class Children implements Playing, Crying, Sleeping {
	public void play() {
		System.out.println(getClass()+" is playing...");
	}

	public void cry() {
		System.out.println("The child is always crying..");

	}

	public void sleep() {
		System.out.println("Child is sleeping..");
	}
}

interface Studying {
	void study(int a);
}

class Boy extends Children implements Studying {
	public void study(int timeOfStudy) {
		System.out.println("The Boy studys for " + timeOfStudy + " hours");
	}
}