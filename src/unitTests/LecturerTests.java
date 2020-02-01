package unitTests;

import static org.junit.Assert.*;

import org.junit.Test;

public class LecturerTests {

	@Test
	public void nameTest() {
		main.Lecturer lecturer = new main.Lecturer();
		
		lecturer.setName("Jane");
		assertNotNull(lecturer.getName());
		assertEquals(lecturer.getName(), "Jane");
		
		lecturer.setName("John");
		assertNotEquals(lecturer.getName(), "Jane");
	}

	@Test
	public void emailTest() {
		main.Lecturer lecturer = new main.Lecturer();
		
		lecturer.setEmail("jane@computer.org");
		assertNotNull(lecturer.getEmail());
		assertEquals(lecturer.getEmail(), "jane@computer.org");
		
		lecturer.setEmail("john@computer.org");
		assertNotEquals(lecturer.getEmail(), "jane@computer.org");
	}

	@Test
	public void idTest() {
		main.Lecturer lecturer = new main.Lecturer();
		
		lecturer.setStaffId("ABCD");
		assertNotNull(lecturer.getStaffId());
		assertEquals(lecturer.getStaffId(),"ABCD");
		
		lecturer.setStaffId("ABCD");
		assertNotEquals(lecturer.getStaffId(), "EFGH");
	}

	@Test
	public void phoneExtTest() {
		main.Lecturer lecturer = new main.Lecturer();
		
		lecturer.setPhoneExt(53218);
		assertNotNull(lecturer.getPhoneExt());
		assertEquals(lecturer.getPhoneExt(),53218);
		
		lecturer.setPhoneExt(53218);
		assertNotEquals(lecturer.getPhoneExt(), 12345);
	}


}
