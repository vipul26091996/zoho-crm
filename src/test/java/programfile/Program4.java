package programfile;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {

		char c;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter the number");
			int n = sc.nextInt();
			if (n == 8 || n == 10 || n == 11) {
				System.out.println("Good Morning");
			}
			System.out.println("Do you want to continue: 'Y' or 'N'");
			c = sc.next().charAt(0);
		} while (c == 'Y' || c == 'y');
		sc.close();
		System.out.println("Thanks");
	}
}
