package unitTests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ LecturerTests.class, StudentTests.class, LibrarianTests.class, SeniorLibrarianTests.class })

public class AllTests {

}
