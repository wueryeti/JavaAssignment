package Day_10;

public class Assignment_question7 {

	public static void main(String[] args) {
		
		
	   int totalMoneyTaken = 100 ;  
	   int priceOfTheItem = 95 ;
	   int restOfTheMoney = totalMoneyTaken - priceOfTheItem ;
	   
	   int numberOf25Cents  = restOfTheMoney/25;
	   
	   int numberOf10Cents =  (restOfTheMoney- numberOf25Cents *25)/10;
	   
	   int numberOf5Cents = (restOfTheMoney - (numberOf25Cents * 25) - (numberOf10Cents * 10))/5;
		
		
	System.out.println(" price in cents : " + priceOfTheItem );	
	System.out.println( "your change is " + numberOf25Cents *25 + " quarter " + numberOf10Cents * 10 +" dimes " + numberOf5Cents*5 + " nickles");
		
		

	}

}
