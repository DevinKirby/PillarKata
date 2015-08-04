package tests;
import static org.junit.Assert.*;

import org.junit.*;

import RomanNumerals.Roman;

public class RomanTests {
	@Test
	public void arabicNumberOneReturnsI() throws Exception {
		assertEquals("I", Roman.convert(1));
	}
	@Test
	public void arabicNumberThreeReturnsIII() throws Exception {
		assertEquals("III", Roman.convert(3));
	}
	@Test
	public void arabicNumberNineReturnsIX() throws Exception {
		assertEquals("IX", Roman.convert(9));
	}
	@Test
	public void arabicNumberTenSixtySixReturnsMLXVI() throws Exception {
		assertEquals("MLXVI", 1066);
	}

}
