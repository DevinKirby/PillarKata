package RomanNumerals;

public class Roman {
	
	public static String convert(int number){
		int arabic = number;
		String roman = "";
		if(arabic / 1000 >= 1){
			roman += "M";
			arabic -= 1000;
		}
		if(arabic / 50 >= 1){
			roman += "L";
			arabic -= 50;
		}
		if(arabic /10 >= 1){
			roman += "X";
			arabic -= 10;
		}
		if(arabic % 10 == 9){
			roman += "IX";
			arabic -= 9;
		}
		if(arabic / 5 >= 1){
			roman += "V";
			arabic -= 5;
		}
		while(arabic > 0){
			roman += "I";
			arabic -= 1;
		}
		return roman;
	}

}
