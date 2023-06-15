package programfile;

import java.util.Scanner;

public class Program34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		char c;
		do {
			int sqr = 0;
			int sum = 0;

			System.out.println("Enter the number");
			int n = sc.nextInt();
			while (n > 0) {
				int rem = n % 10;
				if (rem % 2 == 0) {
					sqr = rem * rem;
					sum = sum + sqr;
					System.out.println(rem + "=" + sqr);
				} else {
					System.out.println(rem + " not an even number");
				}
				n = n / 10;
			}
			System.out.println("Sum of even digit square is " + sum);
			System.out.println("Do you want to continue: 'Y' or 'N'");
			c = sc.next().charAt(0);
		} while (c == 'Y' || c == 'y');
		sc.close();
		System.out.println("Thanks");
	}

}
