package junit;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathfunctionsTest {
	Mathfunctions mathfunctions;
	@BeforeAll
	static void beforeAllinit() {
		System.out.println("this needs to be run before all the methods");
		
	}
	@BeforeEach
	void init() {
		mathfunctions =new Mathfunctions(); 
	}
	@AfterEach
	void claenup() {
		System.out.println("this needs to be cleaning up");
	}
	@AfterAll
	static void ended() {
		System.out.println("this has be printed in the end of the all methods");
	}
	
	@Test
	void testAdd() {
		int expected=2;
		int actual=mathfunctions.Add(1,1);
		assertEquals(expected,actual,"the above method should add the 2 numbers");
	}
	
	@Test 
	void testDiv(){
		assertThrows(ArithmeticException.class,() -> mathfunctions.Div(1, 0),"divide by 0 should throw an exception");
		
	}
	@Test
	void testCirclearea() {
		assertEquals(314.1592653589793,mathfunctions.Circlearea(10),"should return the circle area with the given radius");
	}
	
}
