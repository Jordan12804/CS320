/**
 * 
 */
package jordan;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

/**
 * @author jordancarver1_snhu
 *
 */
class contactTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	public void testContactFirstNameEmpty () {	
		assertThrows(IllegalArgumentException.class, new Executable() {
			@Override
			public void execute() throws Throwable {
				contact c = new contact();
				c.updateFirstName(null);
				
			}
		});
	}
	
	@Test
	public void testContactFirstNameLength () {	
		assertThrows(IllegalArgumentException.class, new Executable() {
			@Override
			public void execute() throws Throwable {
				contact c = new contact();
				c.updateFirstName("HHHHHHHHHHHH");
				
			}
		});
	}
	
	@Test
	public void testContactLastNameEmpty () {
		assertThrows(IllegalArgumentException.class, new Executable() {
			@Override
			public void execute() throws Throwable{
				contact c = new contact();
				c.updateLastName(null);
			}
		});
	}
	
	@Test
	public void testContactLastNameLength () {
		assertThrows(IllegalArgumentException.class, new Executable() {
			@Override
			public void execute () throws Throwable{
					contact c = new contact ();
					c.updateLastName("ErrorErrorError");
					
			}
		});
					
	}
	
	@Test
	public void testContactPhoneNumberEmpty () {
		assertThrows(IllegalArgumentException.class, new Executable() {
			@Override
			public void execute () throws Throwable{
				contact c = new contact ();
				c.updatePhoneNumber(null);
			}
		});
			}
			@Test
			public void testContactPhoneNumberLength () {
				assertThrows(IllegalArgumentException.class, new Executable() {
					@Override
					public void execute () throws Throwable{
						contact c = new contact ();
						c.updatePhoneNumber("ErrorErrorError");
					}
				});
					}
			
			@Test
			public void testConactAddressEmpty () {
				assertThrows(IllegalArgumentException.class, new Executable () {
					@Override 
					public void execute () throws Throwable{
						contact c = new contact ();
						c.updateAddress(null);
					}
				});
					}
			
			@Test
			public void testContactAddressLength () {
				assertThrows(IllegalArgumentException.class, new Executable () {
					@Override
					public void execute () throws Throwable{
						contact c = new contact ();
						c.updateAddress("ErrorErrorErrorErrorErrorErrorError");
					}
				});
			}
			
			@Test public void testContactIdEmpty () {
				assertThrows(IllegalArgumentException.class, new Executable() {
					@Override
					public void execute () throws Throwable{
						contact c = new contact();
						c.updateContactId(null);
					}
				});
					}
			
			@Test
			public void testContactIdLength () {
				assertThrows(IllegalArgumentException.class, new Executable () {
					@Override
					public void execute () throws Throwable{
						contact c = new contact ();
						c.updateContactId("ErrorErrorError");
					}
				});
				
					}
		
			}
			
		
	

