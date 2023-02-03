/*
      1 1 1 1 1 
      2 2 2 2 
      3 3 3 
      4 4 
      5  
 */
package Pattern;

import java.util.Scanner;

public class NumberPattern3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}
