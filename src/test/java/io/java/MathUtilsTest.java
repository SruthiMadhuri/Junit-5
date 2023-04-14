package io.java;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class MathUtilsTest {

	@Test
	void testAdd() {
		MathUtils mathUtils=new MathUtils();
		int expected=2;
		int actual=mathUtils.add(1, 1);
		assertEquals(expected, actual,"The add method should be two numbers");
	}
	@Test
	void testDivide() {
		MathUtils mathUtils=new MathUtils();
		assertThrows(ArithmeticException.class, () -> mathUtils.div(1, 0),"Divide by zero should throw");
		
	}
	@Test
	void testComputeCircleadius() {
		MathUtils mathUtils=new MathUtils();
		assertEquals(314.1592653589793,mathUtils.computeCircleAreaw(10),"Should return right circle area");
	}

}
