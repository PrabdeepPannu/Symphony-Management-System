package symphony.test;

import static org.junit.Assert.*;

import org.junit.Test;

import symphony.domain.ID;

public class IDTest {
	ID t=new ID();
String id="PB26";

/**
 * This test is used to test Constructor
 * */
	@Test
	public void testID() {
		assertNotNull("should be not null", new IDTest());
		System.out.println("Default Constructor");
			assertNotEquals("", new IDTest());
	}

/**
 * This test is used to test GetID
 **/
	@Test
	public void testGetID() {
		System.out.println("Executed ID getter");
		assertEquals(id, t.getID());
		assertTrue(id == t.getID());
	}

/**
 * This test is used to test SetID
 **/
	@Test
	public void testSetID() {
		t.setID("PB26");
		System.out.println("Executed id setter");
		assertEquals("PB26", t.getID());
		assertFalse("1600" == t.getID());
	}

}
