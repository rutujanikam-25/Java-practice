/*
 *  find Palindrome or not
 *  number=121
 *  reverse of number is equal to number
 *  number is palindrome othrewise number is not palindrome
 */
package Number;

import java.util.Scanner;

public class palindromeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n=sc.nextInt();
		int rev=0;
		int num=n;
		while(n!=0) {
			int digit=n%10;
			rev=digit+rev*10;
			n=n/10;
		}
		if(num==rev) {
			System.out.println(num+ " is palindrome");
		}else {
			System.out.println(num+ " is not palindrome");
		}
		
	}

}
