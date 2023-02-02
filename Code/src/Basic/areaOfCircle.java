/*
 * calculate Area of circle
 */
package Basic;

import java.util.Scanner;

public class areaOfCircle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.print("Enter the radius :");
		double radius=sc.nextDouble();
		double area=Math.PI*radius*radius;//formula of area of circle
		System.out.println("Area : "+area);

	}

}
