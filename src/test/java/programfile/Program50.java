package programfile;

import java.util.Scanner;

public class Program50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c;

		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter the number");
			int n = sc.nextInt();
			long fact = factorial(n);
			System.out.println("The factorial of " + n + " is " + fact);
			System.out.println("Do you want to continue: 'Y' ot 'N'");
			c = sc.next().charAt(0);
		} while (c == 'Y' || c == 'y');
		sc.close();
		System.out.println("Thanks");

	}

	public static long factorial(int x) {
		long fact = 1;
		for (int i = x; i > 0; i--) {
			fact = fact * i;
		}
		return fact;
	}

}
