package programfile;

import java.util.Scanner;

public class Program26 {

	public static void main(String[] args) {

		char c;
		Scanner sc = new Scanner(System.in);
		do {
			int count = 0;
			System.out.println("Enter the number:");
			int n = sc.nextInt();
			while (n > 0) {
				int rem = n % 10;
				if (rem % 2 == 0) {
					count++;
				}
				n = n / 10;
			}
			System.out.println("Even digits are: " + count);
			System.out.println("Do you want to continue: 'Y' or 'N'");
			c = sc.next().charAt(0);
		} while (c == 'Y' || c == 'y');
		sc.close();
		System.out.println("Thanks");
	}

}
