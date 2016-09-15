import java.util.Scanner;


public class number5 {

	public static void main(String[] args) {

		Scanner kbScanner = new Scanner(System.in);
		System.out.print("Enter Start:");
		int a = kbScanner.nextInt();
		System.out.print("Enter End:");
		int b = kbScanner.nextInt();

		int c = a++;
		while (c<=b)
		{
			System.out.println(c++);
			
		}
		
		
	}

}
