package programfile;

import java.util.Scanner;

public class Program65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		char c;
		do {
			System.out.println("Enter the number");
		int n=sc.nextInt();
		int digit = countDigit(n);
		int check = checkArmstrong(n, digit);
		if(n==check)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not armstrong");
		}
		System.out.println("Do you want to continue: 'Y' ot 'N'");
		c = sc.next().charAt(0);
	} while (c == 'Y' || c == 'y');
	sc.close();
	System.out.println("Thanks");
	}

	public static int countDigit(int n) {
		int count = 0;
		while (n > 0) {
//			int rem = n % 10;
//			if (rem >= 0) {
//				count++;
//			}
			count++;
			n = n / 10;
		}
		return count;
	}

	public static int checkArmstrong(int n, int digit) {
		int sum = 0;
		while (n > 0) {
			int power = 1;
			int rem = n % 10;
			for (int i = 1; i <= digit; i++) {
				if (rem >= 0) {
					power = power * rem;
				}
			}
			sum = sum + power;
			n = n / 10;
		}
		return sum;
	}

}
