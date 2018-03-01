package symphony.test;

import static org.junit.Assert.*;

import org.junit.Test;

import symphony.domain.Composer;

public class ComposerTest {

	
	/**
	 * This test is used to test default Constructor
	 * */
	@Test
	public void testComposer() {
		assertNotNull("should be not null", new ComposerTest()); // Here assertNotNull is used
		System.out.println("Default Constructor");               // This is used to print Statement
			assertNotEquals("", new ComposerTest());             // Here assertNotEquals is used
	}
   /**
    * This is used to test Second constructor
    **/
	@Test
	public void testComposerNameAddressTelephone() {
		 Composer c = new Composer(null,null,null);           // Here is Composer is initiated
		assertNotNull("should be not null",  c );             // Here assertNotNull is used
		assertNotEquals("", c);                               // Here assertNotEquals is used
		System.out.println("Default Constructor");            // This is used to print Statement
	}

}
