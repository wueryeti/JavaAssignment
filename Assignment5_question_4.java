package Assignments_5;

import java.util.Scanner;

public class Assignment5_question_4 {

	public static void main(String[] args) {
	
	int number=0;
	int product=12;
	while (product<100) {
		
	Scanner scan=new Scanner(System.in);
	System.out.println("Print a number:");
	number= scan.nextInt();
	
	product= product*(number*10);
	System.out.println("result of product= " + product);
		
		
	}
		
}

}
