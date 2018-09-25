public class MyDate{
	private int my_date_;//store date as yyyymmdd
	
	public MyDate(int date) {
		SetMyDate(date);
	}
	
	public MyDate(String date) {
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
		String [] split_date = date.split("/");
		
		String my_date_string = split_date[2] + split_date[0] + split_date[1];
		
		//System.out.println("Converting date from String to Integer: " + my_date_string);
		
		my_date_ = Integer.parseInt(my_date_string);
	}
	
	public int GetMyDate() {
		return my_date_;
	}
	
	public String GetMyDateString() {
		//please return a date string in the format yyyymmdd
		return Integer.toString(my_date_);
	}
	
	public String GetMyDateString1() {
		//please return a date string in the format of mm/dd/yyyy 
		String date = GetMyDateString();
		String month = date.substring(4, 6);
		String year = date.substring(0,4);
		String day = date.substring(6, 8);
		String myDateString = month+"/"+day+"/"+year;
		return myDateString;
	}
	
	public String GetMyDateString2() {
		//please return a date string in the format of dd/mm/yyyy
		String date = GetMyDateString();
		String month = date.substring(4, 6);
		String year = date.substring(0,4);
		String day = date.substring(6, 8);
		String myDateString = day+"/"+month+"/"+year;
		return myDateString;
	}
	
	public boolean IsLeapYear(int year) {
		if (year%4==0) {
			return true;//Returns True if it is a leap year
		}
		else { 
			return false;//returns false if it is not a leap year
		}
	}
	
	
}
