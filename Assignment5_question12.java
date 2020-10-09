package Assignments_5;

public class Assignment5_question12 {

	public static void main(String[] args) {
		
        int number=0;
		
		for(int i=1; i<=10; i++) {    // line
			
		for(int j=1; j<=10; j++) {     // colum
			number+=i;
			System.out.print(number + " ");
		}
			number=0;           //before going next line
			System.out.println();  // next line
		}
		
		

	}

   }
