package programfile;

import java.util.Scanner;

public class Program41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c;
		Scanner sc = new Scanner(System.in);
		do {
			int num = 0;
			System.out.println("Enter the number");
			int n = sc.nextInt();
			for (int i = 1; i <= n / 2; i++) {
				if (n % i == 0) {
					num = num + i;
				}
			}
			if (num == n) {
				System.out.println(n + " is a perfect number");
			} else {
				System.out.println(n + " not a perfect number");
			}
			System.out.println("Do you want to continue: 'Y' or 'N'");
			c = sc.next().charAt(0);
		} while (c == 'Y' || c == 'y');
		sc.close();
		System.out.println("Thanks");

	}

}
