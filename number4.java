import java.util.Scanner;


public class number4 {

	public static void main(String[] args) {
		
		Scanner kbScanner = new Scanner(System.in);
		System.out.print("Enter your weight.");
		int a = kbScanner.nextInt();

		while (a>280)
		{
			System.out.println("You are unable to participate");
			break;
		}
		
		while (a<220)
		{
			System.out.println("You are unable to participate");
			break;
		}
		
		while (a>220 && a<280)
		{
			System.out.println("You may participate");
			break;
		}
		
		
	}

}
