package symphony.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class AccountHolderTest {
   /**
    * This is to test AccountHolder method
    * 
    * */
	
	@Test
	public void testAccountHolder() {
		assertNotNull("should be not null", new AccountHolderTest());//In this assertNotnull is used
		System.out.println("Default Constructor"); //printing the statement
			assertNotEquals("", new AccountHolderTest());//here is arrertNotEquals is used
	}

}
