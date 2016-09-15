import java.util.Scanner;
public class number2 {

	public static void main(String[] args) {
	
		Scanner kbScanner = new Scanner(System.in);
		System.out.print("Enter amount of bolts:");
		int a = kbScanner.nextInt();
		System.out.print("Enter amount of nut:");
		int b = kbScanner.nextInt();
		System.out.print("Enter amount of washer:");
		int c = kbScanner.nextInt();
		
		int d = (a*5);
		int e = (a*3);
		int f = (a*1);
		
		while (b<a)
		{
			System.out.println("check the order: to few nuts");
			System.out.println("Total cost: " + (d+e+f) );
			break;
		}
		
		while (c<2*a)
		{
			System.out.println("check the order: to few washers");
			System.out.println("Total cost: " + (d+e+f) );
			break;
		}
		
		while (c>2*a && b>a)
		{
		System.out.println("Order is OK");
		System.out.println("Total cost: " + (d+e+f) );
		break;
		}		
		
	}

}
