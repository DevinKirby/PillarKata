package RomanNumerals;

public class Roman {
	private int arabic;
	private String roman = "";
	
	public Roman(){
	}
	public String convertArabicToRoman(){
		this.repeatedRoman(getArabic(), 1000, "M");		
		this.notRepeatedRoman(getArabic(), 1000, 900, "CM");
		this.repeatedRoman(getArabic(), 100, "C");
		this.notRepeatedRoman(getArabic(), 100, 50, "L");
		this.repeatedRoman(getArabic(), 10, "X");
		this.notRepeatedRoman(getArabic(), 10, 9, "IX");
		this.repeatedRoman(getArabic(), 5, "V");
		this.repeatedRoman(getArabic(), 1, "I");
		return this.getRoman();
	}
	public int convertRomanToArabic() {
		String tempRoman = getRoman();
		int tempArabic = 0;
		while(tempRoman.length() >= 1){
			if(tempRoman.charAt(0) == 'I' && tempRoman.charAt(1)=='X'){
				tempArabic += 9;
				tempRoman = tempRoman.substring(2);
			}
			else if(tempRoman.charAt(0) == 'I'){
				tempArabic += 1;
				tempRoman = tempRoman.substring(1);
			}
		}
		this.setArabic(tempArabic);
		return arabic;
	}
	public void repeatedRoman(int arabic, int divisor, String r){
		int tempArabic = arabic;
		String tempRoman = this.getRoman();
		while(tempArabic / divisor >= 1){
			tempRoman += r;
			tempArabic -= divisor;	
		}
		this.setArabic(tempArabic);
		this.setRoman(tempRoman);
	}
	public void notRepeatedRoman(int arabic, int divisor, int edge, String r){
		int tempArabic = arabic;
		String tempRoman = this.getRoman();
		if(tempArabic % divisor >= edge){
			tempRoman += r;
			tempArabic -= edge;
		}
		this.setArabic(tempArabic);
		this.setRoman(tempRoman);
	}	
	public int getArabic() {
		return arabic;
	}
	public void setArabic(int arabic) {
		this.arabic = arabic;
	}
	public String getRoman() {
		return roman;
	}
	public void setRoman(String roman) {
		this.roman = roman;
	}
}