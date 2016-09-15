import java.util.Scanner;
public class number8 {

	public static void main(String[] args) {

		Scanner kbScanner = new Scanner(System.in);
		System.out.print("How many integers will be added:");
		int a = kbScanner.nextInt();
		int b = 0;
		int c = 0;
		while (b<a)
		{
			System.out.print("Enter an integer:");
			c += kbScanner.nextInt();
			b++;
		}
		
		System.out.print(c);
		
		
		
		
		
		
	}

}
