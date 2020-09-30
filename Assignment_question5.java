package Day_10;

public class Assignment_question5 {

	public static void main(String[] args) {
		
		int second=3695;
		int hour, minute;
		int remainingSecondsAfterHour;
		int remainingSecondsAfterMinutes;
		
		
	
		
		hour= second/(60*60);
		
		remainingSecondsAfterHour= second % 3600;
		
		minute= remainingSecondsAfterHour/60;
		remainingSecondsAfterMinutes=remainingSecondsAfterHour%60; 
		
		
		System.out.println("inputSecond is 3695");
		System.out.println(hour +" hours, " + minute+ " minutes, " + " and " + remainingSecondsAfterMinutes+ " second." );
		
		
		
		
	}

}
