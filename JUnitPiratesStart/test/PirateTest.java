import static org.junit.Assert.*;

import org.junit.Test;

public class PirateTest {

	@Test
	public void createPirateTest() {
		Pirate p1 = new Pirate("Patchy");
		assertEquals("Patchy", p1.getName());
		assertEquals(4, p1.getLimbsRemaining());
	}

	@Test 
	public void createOctoPirateTest () {
		Pirate p1 = new Pirate ("OctoPete", 8);
		assertEquals("OctoPete", p1.getName());
		assertEquals(8, p1.getLimbsRemaining());
	}
	
	@Test
	public void isDeadTest () {
		Pirate p1 = new Pirate ("PirateSteve");
		assertFalse(p1.isDead());
	}
	
	@Test(timeout = 100)
	public void timeoutTest () {
		for (int i=0; i < 1000; i++) {
			Pirate p = new Pirate ("DreadPirate" + i);
			System.out.println(p);
		}
		
	}
}
