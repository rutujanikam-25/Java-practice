/* 
 * Finding a raised to power b number
 *  a=2 and b=3
 *  ans=a*a*a       --- a multiply in b times
 */
package Number;

import java.util.Scanner;

public class raisePower {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int a=sc.nextInt();
		System.out.println("Enter the second number : ");
		int b=sc.nextInt();
		int ans=1;
		for(int i=1;i<=b;i++) {
			 ans=ans*a;
		}
		System.out.println("Find "+a+" raised to power "+b+" : "+ans);

	}

}
