package programfile;

import java.util.Scanner;

public class Program62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		char c;
		do {
			System.out.println("Enter the number");
			int n = sc.nextInt();
			int prime = 0;
			for (int i = 2; i < n / 2; i++) {
				System.out.println(i);
				if (n % i == 0) {
					prime++;
				}
				System.out.println(i);
			}
			if (prime == 0) {
				System.out.println("Prime Number");
			} else {
				System.out.println("Not a Prime Number");
			}

			System.out.println("Do you want to continue: 'Y' ot 'N'");
			c = sc.next().charAt(0);
		} while (c == 'Y' || c == 'y');
		sc.close();
		System.out.println("Thanks");

	}

}
