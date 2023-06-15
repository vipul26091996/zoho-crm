package programfile;

import java.util.Scanner;

public class Program45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		char c;
		do {
			System.out.println("Enter the number");
			int n = sc.nextInt();
			while (n > 0) {
				int rem = n % 10;
				if (rem % 2 != 0) {
					int fact = 1;
					for (int i = rem; i > 0; i--) {
						fact = fact * i;
					}
					System.out.println("factorial of " + rem + " is " + fact);
				} else {
					System.out.println(rem + " in not the odd number");
				}
				n = n / 10;
			}
			System.out.println("Do you want to continue: 'Y' ot 'N'");
			c = sc.next().charAt(0);
		} while (c == 'Y' || c == 'y');
		sc.close();
		System.out.println("Thanks");
	}

}
