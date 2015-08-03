package RomanNumerals;

public class Roman {
	
	public static String convert(int number){
		int arabic = number;
		String roman = "";
		while(arabic > 0){
			roman += "I";
			arabic -= 1;
		}
		return roman;
	}

}
