package programfile;

import java.util.Scanner;

public class Program53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char c;
		do {
			System.out.println("Enter the number: ");
			int n = sc.nextInt();
			int sum = addAllDigit(n);
			System.out.println("Sum of all digit is: " + sum);
			System.out.println("Do you want to continue: 'Y' ot 'N'");
			c = sc.next().charAt(0);
		} while (c == 'Y' || c == 'y');
		sc.close();
		System.out.println("Thanks");
	}

	public static int addAllDigit(int x) {
		int sum = 0;
		while (x > 0) {
			int rem = x % 10;
			sum = sum + rem;
			x = x / 10;
		}
		return sum;

	}

}
