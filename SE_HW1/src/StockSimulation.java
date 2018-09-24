public class StockSimulation{
	public static void main(String[] args) {
		MyDate date = new MyDate("01/08/2018");
		
		if(date.IsLeapYear(2018)) {
			System.out.println("2018 is a leap year");
		}else {
			System.out.println("2018 is not a leap year");
		}
		
		Stock s = new Stock("Facebook", "FB", 178.33, date);
		
		System.out.println(date.GetMyDateString());
		System.out.println(date.GetMyDateString1());
		System.out.println(date.GetMyDateString2());
		System.out.println(date.GetMyDate());
		
		System.out.println("\n\n\n");
		
		s.getMyDate().SetMyDate("09/24/2018");
		
		if(date.IsLeapYear(2018)) {
			System.out.println("2018 is a leap year");
		}else {
			System.out.println("2018 is not a leap year");
		}
		
		System.out.println(date.GetMyDateString());
		System.out.println(date.GetMyDateString1());
		System.out.println(date.GetMyDateString2());
		System.out.println(date.GetMyDate());
		
		
		//please check that every get method in the MyDate class is correct
	}
}