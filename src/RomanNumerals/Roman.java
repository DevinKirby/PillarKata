package RomanNumerals;

public class Roman {
	private int arabic;
	private String roman = "";
	
	public Roman(){
	}
	public String convertArabicToRoman(){
		this.repeatArToRo(getArabic(), 1000, "M");		
		this.notRepeatArToRo(getArabic(), 1000, 900, "CM");
		this.repeatArToRo(getArabic(), 100, "C");
		this.notRepeatArToRo(getArabic(), 100, 50, "L");
		this.repeatArToRo(getArabic(), 10, "X");
		this.notRepeatArToRo(getArabic(), 10, 9, "IX");
		this.repeatArToRo(getArabic(), 5, "V");
		this.repeatArToRo(getArabic(), 1, "I");
		return this.getRoman();
	}
	public int convertRomanToArabic() {
		String tempRoman = getRoman();
		int tempArabic = 0;
		if(tempRoman.equals("I")){
			tempArabic += 1;
		}
		return tempArabic;
	}
	public void sortLetter(int arabic){
		
	}
	public void repeatArToRo(int arabic, int divisor, String r){
		int tempArabic = arabic;
		String tempRoman = this.getRoman();
		while(tempArabic / divisor >= 1){
			tempRoman += r;
			tempArabic -= divisor;	
		}
		this.setArabic(tempArabic);
		this.setRoman(tempRoman);
	}
	public void notRepeatArToRo(int arabic, int divisor, int edge, String r){
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