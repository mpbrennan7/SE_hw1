//create a stock class
public class Stock
{
	private String name_;
	private String symbol_;
	private double currentPrice_;
	private MyDate myDate_;
	
	
	/**
		The constructor 'Stock' is to set default value without argument.	
	*/
	public Stock()
	{
		//declare default values.
		name_ = "Microsoft";
		symbol_ = "MSFT";	
		currentPrice_ = 110.67;
		myDate_ = new MyDate(20180901);
	}
	
	/**
		The constructor 'Stock' is to relaod with different argument list.	
		@param name_1: pass stock name into current function.
		@param symbol_1: pass stock symbol into current function.
		@param yesterdayPrice_1: pass yesterday Price into current function.
	*/
	public Stock(String name, String symbol, double price, MyDate myDate)
	{
		//delare different variables;
		name_ = name;
		symbol_ = symbol;
		myDate_ = myDate;
	}
	
	/**
		The method 'setName' is to set name.	
		@param name_1: pass value of name into function.
		@return: nothing.
	*/
	public void setName(String name)
	{
		name_ = name;
	}
	
	

	/**
		The method 'getName' is to get name.	
		@return: string type value of name.
	*/
	public String getName()
	{
		return name_;
	}
	
	

	/**
		The method 'setSymbol' is to set symbol.	 
		@param symbol_1: pass string type value of symbol into function.
		@return: nothing
	*/
	public void setSymbol(String symbol)
	{
		symbol_ = symbol;
	}
	

	
	/**
		The method 'getSymbol' is to get symbol.	 
		@return: string type value of symbol 
	*/
	public String getSymbol()
	{
		return symbol_;
	}
	
	

	/**
		The method 'setYesterdayPrice' is to set YesterdayPrice.	
		@param price: pass double type price into function.
		@return: nothing
	*/
	public void setCurrentPrice(double price)
	{
		//prevent set negative price.
		if(price < 0) currentPrice_ = 0.00;			
		else currentPrice_ = price;
	}
	
	
	
	/**
		The method 'getCurrentPrice' is to get CurrentPrice.	
		@return: double type value of current price.
	*/
	public double getCurrentPrice()
	{
		return currentPrice_;
	}	
	
	/**
	 * 
	 */
	public MyDate getMyDate() {
		return myDate_;
	}
	
	/**
	 * 
	 */
	public void setMyDate(MyDate myDate) {
		myDate_ = myDate;
	}
}