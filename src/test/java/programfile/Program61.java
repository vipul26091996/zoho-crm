package programfile;

import java.util.Scanner;

public class Program61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char c;
		do {
			System.out.println("Enter the number");
			int n = sc.nextInt();
			int digit = countDigit(n);
			System.out.println("Digit in the number " + n + " are " + digit);
			System.out.println("Do you want to continue: 'Y' ot 'N'");
			c = sc.next().charAt(0);
		} while (c == 'Y' || c == 'y');
		sc.close();
		System.out.println("Thanks");
	}

	public static int countDigit(int n) {
		int count = 0;
		while (n > 0) {
			int rem = n % 10;
			if (rem >= 0) {
				count++;
			}
			n = n / 10;
		}
		return count;
	}

}
