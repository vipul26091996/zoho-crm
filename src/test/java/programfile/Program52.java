package programfile;

import java.util.Scanner;

public class Program52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char c;
		do {
			System.out.println("Enter the base value:");
			int base = sc.nextInt();
			System.out.println("Enter the exponent value:");
			int exp = sc.nextInt();
			int power = power(base, exp);
			System.out.println(power);
			System.out.println("Do you want to continue: 'Y' ot 'N'");
			c = sc.next().charAt(0);
		} while (c == 'Y' || c == 'y');
		sc.close();
		System.out.println("Thanks");

	}

	public static int power(int x, int y) {
		int power = 1;
		for (int n = 1; n <= y; n++) {
			power = power * x;
		}
		return power;
	}

}
