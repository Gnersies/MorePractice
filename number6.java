import java.util.Scanner;
public class number6 {

	public static void main(String[] args) {

		Scanner kbScanner = new Scanner(System.in);
		System.out.print("Enter a word:");
		String a = kbScanner.next();
		
		int b = a.length();
		int c = 0;
		while (c<b)
		{
			System.out.println(a);
			c++;
		}
		
		
	}

}
