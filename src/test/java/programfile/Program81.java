package programfile;

import java.util.Scanner;

public class Program81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int[] element = new int[10];
		int sum = 0;
		for (int i = 0; i < element.length; i++) {
			System.out.println("Enter the " + i + " index value");
			element[i] = sc.nextInt();
		}
		for (int i = 0; i < element.length; i++) {
			sum = sum + element[i];
		}
		System.out.println("Sum is: " + sum);
		sc.close();
	}

}
