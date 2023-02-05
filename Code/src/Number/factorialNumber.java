/*
 * printing first n factorial number
 *      n=5
 *      5 4 3 2 1 
 *      Factorial of 5 is : 120
 * 
 */
package Number;

import java.util.Scanner;

public class factorialNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number ");
		int n=sc.nextInt();
		int fact=1;
		for(int i=n;i>=1;i--) {
			
			fact=fact*i;
			System.out.print(i+" " );
			
		}
		System.out.println("\n Factorial of "+n+" is : "+fact);
		

	}

}
