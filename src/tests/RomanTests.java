package tests;
import static org.junit.Assert.*;

import org.junit.*;
public class RomanTests {
	@Test
	public void testName() throws Exception {
		assertEquals(1, Roman.convert(1));
	}

}
