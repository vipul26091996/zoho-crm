package programfile;

import java.util.Scanner;

public class Program54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char c;
		do {
			System.out.println("Enter the number");
			int n = sc.nextInt();
			int sum = calcSumofEven(n);
			System.out.println("Sum is: " + sum);
			int sqr = sum * sum;
			System.out.println("Square of the sum is: " + sqr);
			System.out.println("Do you want to continue: 'Y' ot 'N'");
			c = sc.next().charAt(0);
		} while (c == 'Y' || c == 'y');
		sc.close();
		System.out.println("Thanks");
	}

	public static int calcSumofEven(int x) {
		int sum = 0;
		while (x > 0) {
			int rem = x % 10;
			if (rem % 2 == 0) {
				sum = sum + rem;
			} else {
				System.out.println(rem + " is not an even number");
			}
			x = x / 10;
		}
		return sum;
	}

}
