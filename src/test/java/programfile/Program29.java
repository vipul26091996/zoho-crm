package programfile;

import java.util.Scanner;

public class Program29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char c;
		Scanner sc = new Scanner(System.in);
		do {
			int num = 0;
			int temp;
			System.out.println("Enter the number");
			int n = sc.nextInt();
			temp = n;
			while (n > 0) {
				int rem = n % 10;
				num = num * 10 + rem;
				n = n / 10;
			}
			if (temp == num) {
				System.out.println("Palindrome");
			} else {
				System.out.println("Not a palindrome");
			}
			System.out.println("Do you want to continue: 'Y' or 'N'");
			c = sc.next().charAt(0);
		} while (c == 'Y' || c == 'y');
		sc.close();
		System.out.println("Thanks");
	}

}
