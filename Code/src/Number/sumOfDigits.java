/*
 *  sum of digits of a number	
 *  
 *      n= 432
 *      sum of digit =4+3+2
 *      Number of digit in 432 = 9
 *  
 *  
 */


package Number;

import java.util.Scanner;

public class sumOfDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number :");
		int n=sc.nextInt();
		int sumOfDigit=0;
		int Original_no=n;
		int Digit=0;
		while(n>0) {
		    Digit=n%10;
			sumOfDigit=sumOfDigit+Digit;
			n=n/10;
			
		}
		System.out.println("Number of digit in "+Original_no+ " = "+sumOfDigit);
	}

}
