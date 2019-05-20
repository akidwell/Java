import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BootcampCalcTest {

	@Test
	void test() {
		double x = Function.sum(2, 2);
		assertEquals(4, x, .00000);
	}
	
	@Test
	void test2() {
		double x = Function.product(7, 7);
		assertEquals(49, x, .00000);
	}

	@Test
	void test3() {
		double x = Function.difference(100, 50);
		assertEquals(50, x, .00000);
	}
	
	@Test
	void test4() {
		double x = Function.quotient(100, 50);
		assertEquals(2, x, .00000);
	}
}
