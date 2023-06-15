package programfile;

import java.util.Scanner;

public class Program33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		char c;
		do {
			int num = 0;
			System.out.println("Enter the number:");
			int n = sc.nextInt();
			while (n > 0) {
				int rem = n % 10;
				if (rem % 2 != 0) {
					num = rem * rem * rem;
					System.out.println(rem + "=" + num);
				} else {
					System.out.println(rem + " not a odd number");
				}
				n = n / 10;
			}
			System.out.println("Do you want to continue: 'Y' or 'N'");
			c = sc.next().charAt(0);
		} while (c == 'Y' || c == 'y');
		sc.close();
		System.out.println("Thanks");
	}

}
