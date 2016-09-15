import java.util.Scanner;
public class number1 {

	public static void main(String[] args) {
		
		Scanner kbScanner = new Scanner(System.in);
		System.out.print("Enter amount of purchases:");
		double a = kbScanner.nextDouble();
		double b = (a*.9);
		
		while (a>=10)
		{
			System.out.print("Discounted price: " + b);
			break;
		}
		
		
		while (a<10)
		{
			System.out.print("you are not eligable for a discount.");
			break;
		}
		

	}

}
