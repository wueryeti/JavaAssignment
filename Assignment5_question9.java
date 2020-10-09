package Assignments_5;

import java.util.Scanner;
public class Assignment5_question9 {
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			
			System.out.println("Enter a number :");
			int a,b;
			a=1;
			b=scan.nextInt();
			
			if(a<=b) {
				System.out.print(a);
				int i=2;
				while(i<=b) {
					if(i%2==1) {
						System.out.print(","+i);
					}
					i++;
			}
			}
		}
	}