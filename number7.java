import java.util.Scanner;
public class number7 {

	public static void main(String[] args) {

		Scanner kbScanner = new Scanner(System.in);
		System.out.print("Enter first word:");
		String a = kbScanner.next();
		System.out.print("Enter second word:");
		String b = kbScanner.next();

		int c = a.length() + b.length();
		int d = 30-c;
		int e = 0;
		
		System.out.print(a);
		while(e<d)
		{
			System.out.print(".");
			e++;
		}
		System.out.print(b);
		
		
	}

}
