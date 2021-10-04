import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//Task #2
class GradeBookTest {

	//making objects
	private GradeBook obj1;
	private GradeBook obj2;
	
	@BeforeEach
	void setUp() throws Exception {
		//calling the objects
		/*obj1 = new GradeBook(5);
		obj2 = new GradeBook(5);
		
		//adding random scores 
		obj1.addScore(21);
		obj1.addScore(90);
		obj1.addScore(64);
		obj1.addScore(84);
		obj1.addScore(85);
		
		//adding random scores to the other object
		obj2.addScore(60);
		obj2.addScore(83);
		obj2.addScore(79);
		obj2.addScore(94);
		obj2.addScore(96);*/
		
		obj1 = new GradeBook(2);
		obj1.addScore(66);
		obj1.addScore(90);
		
		obj2 = new GradeBook(2);
		obj2.addScore(70);
		obj2.addScore(95);
	}

	@AfterEach
	void tearDown() throws Exception {
	
		obj1=null;
		obj2=null;
		
	}
	

	@Test
	void testAddScore() {
		//Task #3 where we have to use assert true and assert equals
		/*String testStr = "85.0 95.0 93.0";
		
		assertEquals(true, obj1.addScore(93.0));
		assertTrue(obj1.getScoreSize()==5);
		assertTrue(obj1.toString().equals(testStr));*/
		
		
		
		
		/*assertTrue(obj1.toString().equals("21.0 90.0 64.0 84.0 85.0"));
		assertTrue(obj2.toString().equals("60.0 83.0 79.0 94.0 96.0"));
		
		assertEquals(5,obj1.getScoreSize(),.001 );
	
		assertEquals(5,obj2.getScoreSize(),.001 );*/
	
		assertTrue(obj1.toString().equals("66.0 90.0 "));
		assertEquals(2, obj1.getScoreSize(), .0001);
		
		assertTrue(obj2.toString().equals("70.0 95.0 "));
		assertEquals(2, obj2.getScoreSize(), .0001);
	}

	@Test
	void testSum() {
		assertEquals(156, obj1.sum(), .0001);
		assertEquals(165, obj2.sum(), .0001);
	}

	@Test
	void testMinimum() {
		assertEquals(66, obj1.minimum(), .001 );
		assertEquals(70, obj2.minimum(), .001 );
	}

	@Test
	void testFinalScore() {
		assertEquals(90, obj1.finalScore(), .001);
		assertEquals(95, obj2.finalScore(), .001);
	}

	/*@Test
	void testGetScoreSize() {
		fail("Not yet implemented");
	}

	@Test
	void testToStringString() {
		fail("Not yet implemented");
	}*/

}
