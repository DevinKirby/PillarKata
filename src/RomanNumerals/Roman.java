package RomanNumerals;

public class Roman {
	private int arabic;
	private String roman = "";
	
	public Roman(){
	}
	public String convertArabicToRoman(){
		this.iXCM(getArabic(), 1000, "M");		
		this.vLD(getArabic(), 1000, 900, "CM");
		this.iXCM(getArabic(), 100, "C");
		this.vLD(getArabic(), 100, 50, "L");
		this.iXCM(getArabic(), 10, "X");
		this.vLD(getArabic(), 10, 9, "IX");
		this.iXCM(getArabic(), 5, "V");
		this.iXCM(getArabic(), 1, "I");
		return this.getRoman();
	}
	public void iXCM(int arabic, int divisor, String r){
		int tempArabic = arabic;
		String tempRoman = this.getRoman();
		while(tempArabic / divisor >= 1){
			tempRoman += r;
			tempArabic -= divisor;	
		}
		this.setArabic(tempArabic);
		this.setRoman(tempRoman);
	}
	public void vLD(int arabic, int divisor, int edge, String r){
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