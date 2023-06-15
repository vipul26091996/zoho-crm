package programfile;

import java.util.Scanner;

public class Program35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		char c;
		do {
			int sum = 0;
			System.out.println("Enter the number:");
			int n = sc.nextInt();
			while (n > 0) {
				int rem = n % 10;
				if (rem % 2 != 0) {
					int cube = rem * rem * rem;
					sum = sum + cube;
					System.out.println(rem + "=" + cube);
				} else {
					System.out.println(rem + " not a odd number");
				}
				n = n / 10;
			}
			System.out.println("Sum of cube is: " + sum);
			System.out.println("Do you want to continue: 'Y' or 'N'");
			c = sc.next().charAt(0);
		} while (c == 'Y' || c == 'y');
		sc.close();
		System.out.println("Thanks");
	}

}
