package Assignments_5;

import java.util.Scanner;

public class Assignment5_question_8 {

	public static void main(String[] args) {
		
	int sum=0;
	int lowerbound=1;
	int upperbond=100;
	int number= lowerbound;
	 
	
   while (number<= upperbond) {
	   sum+=number;
	   ++number;
	   
	   System.out.println("if upperbond is " + (number-1) + ", sum should be "+ sum);
   }
		
		

	}

}
