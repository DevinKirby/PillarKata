package RomanNumerals;

public class Roman {
	
	public static String convert(int number){
		int arabic = number;
		String roman = "";
		if(arabic % 10 == 9){
			roman += "IX";
			arabic -= 9;
		}
		while(arabic > 0){
			roman += "I";
			arabic -= 1;
		}
		return roman;
	}

}
