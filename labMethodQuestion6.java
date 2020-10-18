package Day_14_MethodCont;

public class labMethodQuestion6 {

	public static void main(String[] args) {
		
		cigarParty (30, false);
		cigarParty (50, false);
		cigarParty (70, true);
	}

	public static void cigarParty (int number, boolean isWeekend) {
		
		
		
		if (isWeekend) {
			if (number>=40) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
		} else {
			if (number>=40 && number<=60) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
		}
	}
	
}
