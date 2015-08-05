package tests;
import static org.junit.Assert.*;

import org.junit.*;

import RomanNumerals.Roman;

public class RomanTests {
	Roman roman;
	@Before
	public void declareRomanObject(){
		roman = new Roman();
	}
	@Test
	public void arabicNumberOneReturnsI() throws Exception {
		roman.setArabic(1);
		assertEquals("I", roman.convertArabicToRoman());
	}
	@Test
	public void arabicNumberThreeReturnsIII() throws Exception {
		roman.setArabic(3);
		assertEquals("III", roman.convertArabicToRoman());
	}
	@Test
	public void arabicNumberNineReturnsIX() throws Exception {
		roman.setArabic(9);
		assertEquals("IX", roman.convertArabicToRoman());
	}
	@Test
	public void arabicNumber1066ReturnsMLXVI() throws Exception {
		roman.setArabic(1066);
		assertEquals("MLXVI", roman.convertArabicToRoman());
	}
	@Test
	public void arabicNumber1989ReturnsMCMLXXXIX() throws Exception {
		roman.setArabic(1989);
		assertEquals("MCMLXXXIX", roman.convertArabicToRoman());
	}
	@Test
	public void arabicNumber39ReturnsXXXIX() throws Exception {
		roman.setArabic(39);
		assertEquals("XXXIX", roman.convertArabicToRoman());
	}

}
