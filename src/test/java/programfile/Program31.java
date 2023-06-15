package programfile;

import java.util.Scanner;

public class Program31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		char c;
		do {
			System.out.println("Enter the base number:");
			int base = sc.nextInt();
			System.out.println("Enter the exponent value:");
			int exp = sc.nextInt();
			double num = 1;
			if (exp == 0) {
				System.out.println("Power of a number is:"+num);
			} else {
				if (exp > 0) {
					for (int i = 1; i <= exp; i++) {
						num = base * num;
					}
					System.out.println("Power of a number is: " + num);
				} else {
					for (int i = -1; i >= exp; i--) {
						num = base * num;
					}
					num = 1 / num;
					System.out.println("Power of the number is: " + num);
				}

			}
			System.out.println("Do you want to continue: 'Y' or 'N'");
			c = sc.next().charAt(0);
		} while (c == 'Y' || c == 'y');
		sc.close();
		System.out.println("Thanks");
	}

}
