package tests;
import static org.junit.Assert.*;
import org.junit.*;
import RomanNumerals.Roman;

public class RomanTests {
	@Test
	public void testName() throws Exception {
		assertEquals("I", Roman.convert(1));
	}

}
