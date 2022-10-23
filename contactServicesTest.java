/**
 * 
 */
package jordan;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import org.junit.jupiter.api.BeforeEach;


import org.junit.jupiter.api.Test;
/**
 * @author jordancarver1_snhu
 *
 */
class contactServicesTest {
	protected String contactId, firstNameTest, lastNameTest, phoneNumberTest,
	addressTest;
	protected String tooLongContactId, tooLongFirstName, tooLongLastName,
	tooLongPhoneNumber, tooShortPhoneNumber, tooLongAddress;
	
	@BeforeEach
	void setUp() {
		contactId = "1234567890";
		firstNameTest = "Jordan";
		lastNameTest = "Carver";
		phoneNumberTest = "7707575713";
		addressTest = "1100 old Jasper GA 30143";
		tooLongContactId = "112233445566778899";
		tooLongFirstName = "Jordan David Carver";
		tooLongLastName = "Jordan David Carver";
		tooLongPhoneNumber = "7707575713";
		tooShortPhoneNumber = "7575713";
		tooLongAddress = " 1100 Old Philadelphia Rd, Jasper, GA 30143";
	}
	
	@Test 
	void newcontactTest() {
		contactService service = new contactService();
		service.newcontact();
		assertAll(
				"service",
				()
					-> assertNotNull(service.getContactList().get(0).getContactId()),
				()
					-> assertEquals("INITIAL",
						service.getContactList().get(0).getFirstName()),
				()
				-> assertEquals("7707575713",
						service.getContactList().get(0).getPhoneNumber()),
				()
				-> assertEquals("INITIAL",
						service.getContactList().get(0).getAddress()));
		service.newContact(firstNameTest);
		assertAll(
				"service",
				()
				-> assertNoNull(service.getContactList().get(1).getcontactId()),
				()
				-> assertEquals(firstNameTest,
						service.getContactList().get(1).getFirstName()),
				()
				-> assertEquals("INITIAL",
						service,getContactList().get(1).getLastName()),
				()
				-> assertEquals("7707575713",
						service.getContactList().get(1).getPhoneNumber()),
				()
				-> assertEquals("INITIAL",
						service.getContactList().get(1).getAddress()));
		service.newContact(firstNameTest, lastNameTest);
		assertAll(
				"service",
				()
				-> assertNotNull(service.getContactList().get(2).getcontactId()),
				()
				-> assertEquals(firstNameTest,
						service.getcontactList().get(2).getFirstName()),
				()
				-> assertEquals(lastNameTest,
						service.getcontactList().get(2).getLastName()),
				()
				-> assertEquals("7707575713",
						service.getcontactList().get(2).getPhoneNumber()),
				()
				-> assertEquals("INITIAL",
						service.getcontactList().get(2).getAddress()));
		service.newcontact(firstNameTest, lastNameTest, phoneNumberTest);
		assertAll(
				"service",
				()
				-> assertNotNull(service,getcontactList().get(3).getcontactId()),
				()
				-> assertEquals(firstNameTest,
						service.getcontactList().get(3).getFirstName()),
				()
				-> assertEquals(lastNameTest,
						service.getcontactList().get(3).getLastName()),
				()
				-> assertEquals(phoneNumberTest,
						service.getcontactList().get(3).getPhoneNumber()),
				()
				-> assertEquals("INITIAL",
						service.getcontactList().get(3).getAddress()));
		service.newcontact(firstNameTest, lastNameTest, phoneNumberTest,
				addressTest);
		assertAll(
				"service",
				()
				-> assertNotNull(service.getcontactList().get(4).getcontactId()),
				()
				-> assertEquals(firstNameTest,
						service.getcontactList().get(4).getFirstName()),
				()
				-> assertEquals(lastNameTest,
						service.getcontactList().get(4).getLastName()),
				()
				-> assertEquals(phoneNumberTest,
						service.getcontactList().get(4).getPhoneNumber()),
				()
				-> assertEquuals(addressTest,
						service.getcontactList().get(4).getAddress()));
	}
				
	@Test
	void deletecontactTest() {
		contactService service = new contactService();
		service.newContact();
		assertThrows(Exception.class, () -> service.deleteContact(contactId));
		assertAll(()
					-> service.deletecontact(
						service.getcontactList().get(0).getContactId()));
	}
	
	@Test
	void updateFirstNameTest() throws Exception {
		contactService service = new contactService();
		service.newcontact();
		service.updateFirstName(service.getcontactList().get(0).getcontactId(),
				firstNameTest);
		assertEquals(firstnameTest, service.getcontactList().get(0).getFirstName());
		assertThrows(IllegalArgumentException.class,
				()
				-> service.updateFirstName(
						service.getcontactList().get(0).getcontactId(),
						tooLongFirstName));
		assertThrows(IllegalArgumentException.class,
				()
				-> service.updateFirstName(
						service.getcontactList().get(0).getcontactId(), null));
		assertThrows(Exception.class,
				() -> service.updateFirstName(contactId, firstNameTest));
	}
	
	@Test
	void updateLastNameTest() throws Exception {
		contactService service = new contactService();
		service.newContact();
		service.updateLastName(service.getContactList().get(0).getContactId(),
				lastNameTest);
		assertEquals(lastNameTest, service.getContactList().get(0).getLastName());
		assertThrows(IllegalArgumentException.class,
				()
				-> service.updateLastName(
						service.getContactList().get(0).getContactId(),
						tooLongLastName));
		assertThrows(IllegalArgumentException.class,
				()
				-> service.updateLastName(
						service.getContactList().get(0).getContactId(), null));
		assertThrows(Exception.class,
				() -> service.updateLastName(contactId, lastNameTest));
	}
	
	@Test
	void updatePhoneNumberTest() throws Exception {
		contactService service = new contactService();
		service.newcontact();
		service.updatePhoneNumber(service.getcontactList().get(0).getcontactId(),
				phoneNumberTest);
		assertEquals(phoneNumberTest,
				service.getcontactList().get(0).getPhoneNumber());
		assertThrows(IllegalArgumentException.class,
				()
				-> service.updatePhoneNumber(
						service.updatePhoneNumber(
								service.getcontactList().get(0).getcontactId(),
								tooLongPhoneNumber));
				assertThrows(IllegalArgumentException.class,
						()
						-> service.updatePhoneNumber(
								service.getcontactList().get(0).getcontactId(),
								tooShortPhoneNumber));
				assertThrows(
						IllegalArgumentException.class,
						()
						-> service.updatePhoneNumber(
								service.getcontactList().get(0).getcontactId(), contactId));
				assertThrows(IllegalArgumentException.class,
						()
						service.updatePhoneNumber(
								service.getcontactList().get(0).getContactId(), null));
				assertThrows(Exception.class,
						() -> service.updatePhoneNumber(contactId, lastNameTest));
	}
	
	@Test
	void updateAddressTest() throws Exception {
		contactService service = new contactService();
		service.newcontact();
		service.updateAddress(service.getcontactList().get(0).getContactId(),
				addressTest);
		assertEquals(addressTest, service.getcontactList().get(0).getAddress());
		assertThrows(IllegalArgumentException.class,
				()
				-> service.updateAddress(
						service.getcontactList().get(0).getContactId(),
						tooLongAddress));
		assertThrows(IllegalArgumentException.class,
				()
				-> service.updateAddress(
						service.getcontactList().get(0).getContactId(), null));
		assertThrows(Exception.class,
					() -> service.updateAddress(contactId, addressTest));
	}
}