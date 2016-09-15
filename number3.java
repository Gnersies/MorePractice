import java.util.Scanner;
import java.io.*;
import java.util.*;
public class number3 {

	public static void main(String[] args) {


		Scanner kbScanner = new Scanner(System.in);
		System.out.print("Enter capacity of gas tank, in gallons:");
		int a = kbScanner.nextInt();
		System.out.print("Enter % of gas:");
		int b = kbScanner.nextInt();
		System.out.print("Enter miles per gallon of your car:");
		int c = kbScanner.nextInt();
		
		int d = b/100;
		int e = a*d; //the amount of gas left
		int f = e*c; 
		
		while (f>200)
				{
			System.out.println("Safe to proceed");
			break;
				}
		
		while (f<200)
		{
	System.out.println("Get gas");
	break;
		}
		
	}

}
