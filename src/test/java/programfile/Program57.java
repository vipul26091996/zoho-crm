package programfile;

import java.util.Scanner;

public class Program57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c;
		Scanner sc = new Scanner(System.in);
		do {
			int sum = 0;
			System.out.println("Enter the number");
			int n = sc.nextInt();
			int temp=n;
			while (temp > 0) {
				int fact = 1;
				int rem = temp % 10;
				for (int i = rem; i > 0; i--) {
					fact = fact * i;
				}
				sum = sum + fact;
				temp = temp / 10;
			}
			if (sum == n) {
				System.out.println(n + " is a Strong number");
			} else {
				System.out.println(n + " is not a Strong Number");
			}
			System.out.println("Do you want to continue: 'Y' ot 'N'");
			c = sc.next().charAt(0);
		} while (c == 'Y' || c == 'y');
		sc.close();
		System.out.println("Thanks");
	}

}
