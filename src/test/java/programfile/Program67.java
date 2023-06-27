package programfile;

public class Program67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		patternB();
		System.out.println("========================");
		patternA();
		System.out.println("========================");
		patternX();
		System.out.println("========================");
		patternC();
		System.out.println("========================");

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

}
