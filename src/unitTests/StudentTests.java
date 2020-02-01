package unitTests;

import static org.junit.Assert.*;

import org.junit.Test;

public class StudentTests {

	@Test
	public void nameTest() {
		main.Student student = new main.Student();
		
		student.setName("Jane");
		assertNotNull(student.getName());
		assertEquals(student.getName(), "Jane");
		
		student.setName("John");
		assertNotEquals(student.getName(), "Jane");
	}

	@Test
	public void emailTest() {
		main.Student student = new main.Student();
		
		student.setEmail("jane@computer.org");
		assertNotNull(student.getEmail());
		assertEquals(student.getEmail(), "jane@computer.org");
		
		student.setEmail("john@computer.org");
		assertNotEquals(student.getEmail(), "jane@computer.org");
	}
	
	@Test
	public void idTest() {
		main.Student student = new main.Student();
		
		student.setStudentId(1);
		assertNotNull(student.getStudentId());
		assertEquals(student.getStudentId(), 1);
		
		student.setStudentId(1);
		assertNotEquals(student.getStudentId(), -1);
	}

	@Test
	public void usernameTest() {
		main.Student student = new main.Student();
		
		student.setUserName("Jane");
		assertNotNull(student.getUserName());
		assertEquals(student.getUserName(), "Jane");
		
		student.setUserName("John");
		assertNotEquals(student.getUserName(), "Jane");
	}

}
