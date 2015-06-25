package testing;

import org.junit.*;
import static org.junit.Assert.*;
import testing.Person;
/** A simple test case for Person */
// BEGIN main
public class PersonTest {

	@Test
	public void testgetFullName() {
		Person p = new Person("Ian", "Darwin");
		String f = p.getFullName();
		assertEquals("Name concatenation", "Ian Darwin", f);
	}
}
// END main
