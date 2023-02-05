/*
 *  Reversing the digits of a number
 *  
 *     n=324
 *     Reverse number is  423
 */
package Number;

import java.util.Scanner;

public class reverseTheDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n=sc.nextInt();
		int rev=0;
		int Original_no=n;
		while(n>0) {
			int digit=n%10;
			rev=digit+rev*10;
			n=n/10;
		}
		System.out.println("Original number is : "+Original_no+"\n Reverse number is  "+rev);

	}

}
