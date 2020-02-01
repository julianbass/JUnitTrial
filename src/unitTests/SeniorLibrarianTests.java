package unitTests;

import static org.junit.Assert.*;

import org.junit.Test;

public class SeniorLibrarianTests {

	@Test
	public void nameTest() {
		main.SeniorLibrarian seniorLibrarian = new main.SeniorLibrarian();
		
		seniorLibrarian.setName("Jane");
		assertNotNull(seniorLibrarian.getName());
		assertEquals(seniorLibrarian.getName(), "Jane");
		
		seniorLibrarian.setName("John");
		assertNotEquals(seniorLibrarian.getName(), "Jane");
	}
	
	@Test
	public void emailTest() {
		main.SeniorLibrarian seniorLibrarian = new main.SeniorLibrarian();
		
		seniorLibrarian.setEmail("jane@computer.org");
		assertNotNull(seniorLibrarian.getEmail());
		assertEquals(seniorLibrarian.getEmail(), "jane@computer.org");
		
		seniorLibrarian.setEmail("john@computer.org");
		assertNotEquals(seniorLibrarian.getEmail(), "jane@computer.org");
	}

	@Test
	public void phoneExtTest() {
		main.SeniorLibrarian seniorLibrarian = new main.SeniorLibrarian();
		
		seniorLibrarian.setPhoneExt(53218);
		assertNotNull(seniorLibrarian.getPhoneExt());
		assertEquals(seniorLibrarian.getPhoneExt(),53218);
		
		seniorLibrarian.setPhoneExt(53218);
		assertNotEquals(seniorLibrarian.getPhoneExt(), 12345);
	}


	@Test
	public void subjectLeadTest() {
		main.SeniorLibrarian seniorLibrarian = new main.SeniorLibrarian();
		
		seniorLibrarian.setSubjectLead("Software Engineering");
		assertNotNull(seniorLibrarian.getSubjectLead());
		assertEquals(seniorLibrarian.getSubjectLead(), "Software Engineering");
		
		seniorLibrarian.setSubjectLead("Software Engineering");
		assertNotEquals(seniorLibrarian.getSubjectLead(), "Maths");
	}

	
}
