package Day_10;

public class Assignment_question6 {

	public static void main(String[] args) {
		
		int lethal= 10000;       // g
		int numberOfMilligramsOfCoffaine= 500;      // mg
		int numberOfDrinksTokill= lethal/numberOfMilligramsOfCoffaine;
		
		System.out.println("Number of milligrams in drink: 500");
		System.out.println("it would take about " + numberOfDrinksTokill + " drinks for a lethal overdose." );
		
	

	}

}
