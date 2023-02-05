/*
 *   Count of digits in number
 *    n= 432
*     Number of digit in 432 = 3
 *   
 */
package Number;

import java.util.Scanner;

public class countDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number :");
        int n=sc.nextInt();
        int original_no =n;
        int numberOfDigit=0;
        while(n>0) {
        	n=n/10;
        	numberOfDigit++;
        }
        System.out.println("Number Of digites in "+ original_no + " = " +numberOfDigit);
	}

}
