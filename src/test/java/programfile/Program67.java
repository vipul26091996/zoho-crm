package programfile;

import java.util.Scanner;

public class Program67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		patternB();
//		System.out.println("========================");
//		patternA();
//		System.out.println("========================");
//		patternX();
//		System.out.println("========================");
//		patternC();
//		System.out.println("========================");
diamondPattern();
	}

	public static void patternB() {
		for (int i = 1; i <= 7; i++) {

			for (int j = 1; j <= 4; j++) {

				if (((i == 1 || i == 4 || i == 7) && j < 4)
						|| ((j == 1 || j == 4)) && (i == 2 || i == 3 || i == 5 || i == 6)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();

		}

	}

	public static void patternA() {
		int i, j, n = 8;
		// Outer for loop for number of lines
		for (i = 0; i <= n; i++) {
			// Inner for loop for logic execution
			for (j = 0; j <= n / 2; j++) {
				// prints two vertical lines
				if ((j == 0 || j == n / 2) && i != 0 ||
				// print first line of alphabet
						i == 0 && j != n / 2 ||
						// prints middle line
						i == n / 2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void patternX() {
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {
				if ((i + j) == 8 || i == j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void patternC() {
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 4; j++) {
				if (j == 1 || (i == 1 || i == 7)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void diamondPattern()
	{
		Scanner sc =new Scanner(System.in);
		char[] alphabets = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
	            'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
	            'W', 'X', 'Y', 'Z' };
		System.out.println("Enter a character between A to Z:");
		char c =sc.next().charAt(0);
		int charVal=0;
		System.out.println(c);
		System.out.println(alphabets.length);
		for(int i=1;i<alphabets.length;i++)
		{
			if(alphabets[i]==c)
			{
				charVal=i+1;
				System.out.println(i);
				break;
			}
		}
		int space = charVal;
		int space2 = charVal;
		System.out.println(charVal);
		for(int i=1;i<=charVal;i++)
		{
			for(int j=space-1;j>0;j--)
			{
				System.out.print(" ");
			}
			System.out.print(alphabets[i-1]);
			for(int j=2;j<=2*i-1;j++)
			{
				System.out.print(" ");
			}
			System.out.print(alphabets[i-1]);
			space--;
			System.out.println();
		}
		for(int i=charVal;i<=1;i--)
		{
			space++;
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			System.out.print(alphabets[i-1]);
			for(int j=7;j<=2*i-1;j++)
			{
				System.out.print(" ");
			}
			System.out.print(alphabets[i-1]);
			System.out.println();
		}
	}

}
