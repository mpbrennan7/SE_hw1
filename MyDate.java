public class MyDate{
	private int my_date_;
	
	public MyDate(int date) {
		SetMyDate(date);
	}
	
	public void SetMyDate(int date) {
		//assume that the date will be in the format yyyymmdd
		//date is an integer
		my_date_ = date;
	}
	
	public void SetMyDate(String date) {
		//assume that the date will be in the format mm/dd/yyyy
		//my_date_ = 
	}
	
	public int GetMyDate() {
		return my_date_;
	}
	
	public String GetMyDateString() {
		//please return a date string in the format yyyymmdd
	}
	
	public String GetMyDateString1() {
		//please return a date string in the format of mm/dd/yyyy 
	}
	
	public String GetMyDateString2() {
		//please return a date string in the format of dd/mm/yyyy
	}
	
	public boolean IsLeapYear(int year) {
		//please return true if the year is a leap year
		//return false if the year is not a leap year
	}
	
	
}