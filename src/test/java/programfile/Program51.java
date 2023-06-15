package programfile;

import java.util.Scanner;

public class Program51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter the number:");
			int n = sc.nextInt();
			int sqr = square(n);
			System.out.println("Square of " + n + " is " + sqr);
			System.out.println("Do you want to continue: 'Y' ot 'N'");
			c = sc.next().charAt(0);
		} while (c == 'Y' || c == 'y');
		sc.close();
		System.out.println("Thanks");
	}

	public static int square(int x) {
		int sqr = x * x;
		return sqr;
	}

}
