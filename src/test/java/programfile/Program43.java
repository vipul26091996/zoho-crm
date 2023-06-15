package programfile;

import java.util.Scanner;

public class Program43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		char c;
		do {
			long fact = 1;
			System.out.println("Enter the positive integer number");
			long n = sc.nextInt();
			if (n != 0) {
				if (n > 0) {
					for (long i = n; i > 0; i--) {
						fact = fact * i;
					}
				} else {
					for (long i = n; i < 0; i++) {
						fact = fact * i;
					}
				}
				System.out.println("Factorial of " + n + " is " + fact);
			} else {
				System.out.println("Factorial is 1");
			}
			System.out.println("Do you want to continue: 'Y' or 'N'");
			c = sc.next().charAt(0);
		} while (c == 'Y' || c == 'y');
		sc.close();
		System.out.println("Thanks");

	}

}
