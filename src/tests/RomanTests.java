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
	public void arabicNumber1066ReturnsMLXVI() throws Exception {
		assertEquals("MLXVI", Roman.convert(1066));
	}
	@Test
	public void arabicNumber1989ReturnsMCMLXXXIX() throws Exception {
		assertEquals("MCMLXXXIX", Roman.convert(1989));
	}

}
