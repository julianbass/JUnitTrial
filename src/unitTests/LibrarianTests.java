package unitTests;

import static org.junit.Assert.*;

import org.junit.Test;

public class LibrarianTests {

	@Test
	public void nameTest() {
		main.Librarian librarian = new main.Librarian();
		
		librarian.setName("Jane");
		assertNotNull(librarian.getName());
		assertEquals(librarian.getName(), "Jane");
		
		librarian.setName("John");
		assertNotEquals(librarian.getName(), "Jane");
	}

	@Test
	public void emailTest() {
		main.Librarian librarian = new main.Librarian();
		
		librarian.setEmail("jane@computer.org");
		assertNotNull(librarian.getEmail());
		assertEquals(librarian.getEmail(), "jane@computer.org");
		
		librarian.setEmail("john@computer.org");
		assertNotEquals(librarian.getEmail(), "jane@computer.org");
	}

	@Test
	public void phoneExtTest() {
		main.Librarian librarian = new main.Librarian();
		
		librarian.setPhoneExt(53218);
		assertNotNull(librarian.getPhoneExt());
		assertEquals(librarian.getPhoneExt(),53218);
		
		librarian.setPhoneExt(53218);
		assertNotEquals(librarian.getPhoneExt(), 12345);
	}


	@Test
	public void libraryIdTest() {
		main.Librarian librarian = new main.Librarian();
		
		librarian.setLibraryId(53218);
		assertNotNull(librarian.getLibraryId());
		assertEquals(librarian.getLibraryId(),53218);
		
		librarian.setLibraryId(53218);
		assertNotEquals(librarian.getLibraryId(), 12345);
	}


}
