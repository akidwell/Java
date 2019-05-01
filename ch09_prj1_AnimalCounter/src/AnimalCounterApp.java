
public class AnimalCounterApp {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("Counting Alligators...");
		System.out.println();
		Alligator a = new Alligator();
		count(a, 3);
		System.out.println();
		
		System.out.println("Counting Sheep...");
		System.out.println();
		Sheep s = new Sheep();
		s.setName("Blackie");
		count(s, 2);
		System.out.println();
		
		Sheep s2= (Sheep) s.clone();
		s2.setName("Dolly");
		count(s2, 3);
		System.out.println();
		
		count(s, 1);
	}
	public static void count(Countable c, int maxCount) {
	c.resetCount();
	for (int i = 0; i < maxCount; i++) {
		c.incrementCount();
		System.out.println(c.getCountString());}
	}
		
	}
