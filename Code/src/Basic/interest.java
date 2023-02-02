/*
 * write a program to input pricipal,time and rate from user and find simple interest
 */
package Basic;

import java.util.Scanner;

public class interest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
	    System.out.println("enter Principal, rate and time : ");
		int principal=sc.nextInt();
		double rate=sc.nextInt();
		int time=sc.nextInt();
		double si=(principal*rate*time)/100;//formula of simple interest
		System.out.println("simpal interest is :"+si);

	}

}
