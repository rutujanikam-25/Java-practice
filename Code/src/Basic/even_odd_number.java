/*
 * Write a program to print whether a number is even or odd,also take input from user.
 */
package Basic;
import java.util.Scanner; 

public class even_odd_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);  //create Scanner class object
		System.out.print("Enter the number :");
		int n=sc.nextInt();  //input from user
		if(n%2==0)//even odd no. logic
		{
			System.out.println(n+" is Even number");
		}
		else {
			System.out.println(n+ " is odd number");
		}

	}

}
