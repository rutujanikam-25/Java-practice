/*
 * Cheak whether or not the year is a leap
 */
package Basic;

import java.util.Scanner;

public class leapYear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter a year ");
		int year=sc.nextInt();
		if((year%4==0 && year%100!=0) ||(year%400==0)) //leap year condition
		{
			System.out.println(year+" is a Leap Year ");
		}else {
			System.out.println(year+" is not a Leap Year");
		}

	}

}
