package programfile;

public class Program68 {

	static int row = 7;
	static int column = 7;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		patternA();
		System.out.println("===============================");
		patternB();
		System.out.println("===============================");
		patternC();
		System.out.println("===============================");
		patternD();
		System.out.println("===============================");
		patternE();
		System.out.println("===============================");
		patternF();
		System.out.println("===============================");
		patternG();
		System.out.println("===============================");
		patternH();
		System.out.println("===============================");
		patternI();
		System.out.println("===============================");
		patternJ();
		System.out.println("===============================");
		patternK();
		System.out.println("===============================");
		patternL();
		System.out.println("===============================");
		patternM();
		System.out.println("===============================");
		patternN();
		System.out.println("===============================");
		patternO();
		System.out.println("===============================");
		patternP();
		System.out.println("===============================");
		patternQ();
		System.out.println("===============================");
		patternR();
		System.out.println("===============================");
		patternS();
		System.out.println("===============================");
		patternT();
		System.out.println("===============================");
		patternU();
		System.out.println("===============================");
		patternV();
		System.out.println("===============================");
		patternW();
		System.out.println("===============================");
		patternX();
		System.out.println("===============================");
		patternY();
		System.out.println("===============================");
		patternZ();
	}

	public static void patternB() {
		for (int i = 1; i <= row; i++) {

			for (int j = 1; j <= column; j++) {

				if (((i == 1 || i == 4 || i == 7) && j < column)
						|| ((j == 1 || j == column)) && (i == 2 || i == 3 || i == 5 || i == 6)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();

		}

	}
	/*
	 * public static void patternA() { int i, j, n = 8; // Outer for loop for number
	 * of lines for (i = 0; i <= n; i++) { // Inner for loop for logic execution for
	 * (j = 0; j <= n / 2; j++) { // prints two vertical lines if ((j == 0 || j == n
	 * / 2) && i != 0 || // print first line of alphabet i == 0 && j != n / 2 || //
	 * prints middle line i == n / 2) System.out.print("*"); else
	 * System.out.print(" "); } System.out.println(); } }
	 */

	public static void patternA() {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= column; j++) {
				if ((j == 1 || j == 7) && i != 1 || i == 5 || i == 1 && (j != 1 && j != 7))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void patternC() {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= column; j++) {
				if ((j == 1 && (i != 1 && i != 7)) || ((i == 1 || i == 7) && j != 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void patternH() {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= column; j++) {
				if (j == 1 || j == column || i == 4) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void patternD() {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= column; j++) {
				if (((i == 1 || i == 7) && (j < column)) || ((j == 1 || j == column) && (i != 1 && i != 7))) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void patternE() {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= column; j++) {
				if (j == 1 || (i == 1 || i == 4 || i == 7)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void patternF() {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= column; j++) {
				if ((j == 1) || (i == 1 || i == 4)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void patternQ() {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= column; j++) {
				if ((j == 1 || j == 6) && (i != 1 && i != 7) || ((i == 1 || i == 7) && (j != 1 && j < 6))
						|| ((i == 5 && j == 5) || ((i + j) == 14))) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void patternR() {

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= column; j++) {
				if ((j == 1 || (j == 7 && (i == 2 || i == 3))) || ((i == 1 || i == 4) && j < 7)
						|| ((j == (i - 1)) && i != 3)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

	public static void patternP() {

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= column; j++) {
				if ((j == 1 || (j == 7 && (i == 2 || i == 3)) || ((i == 1 || i == 4) && j < 7))) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

	public static void patternS() {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= column; j++) {
				if ((i == 1 || i == 4 || i == 7) || ((j == 1) && (i == 2 || i == 3))
						|| ((j == column) && (i == 5 || i == 6))) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void patternG() {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= column; j++) {
				if (j == 1 || (i == 1 || i == row) || ((i >= 4) && (j == column)) || ((i == 4) && (j >= 4))) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void patternW() {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= column; j++) {
				if (j == 1 || j == 7 || (i == j && i >= 4) || ((i + j) == 8 && i > 4)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void patternX() {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= column; j++) {
				if (i == j || (i + j) == 8) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void patternY() {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= column; j++) {
				if ((i == j && i < 5) || ((i + j) == 8 && i < 5) || (j == 4 && i >= 5)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void patternZ() {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= column; j++) {
				if (i == 1 || i == 7 || (i + j) == 8) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void patternI() {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= column; j++) {
				if (i == 1 || i == 7 || j == 4) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void patternJ() {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= column; j++) {
				if ((j == 5 && i != 7) || i == 1 || ((i == 5 || i == 6) && j == 1)
						|| ((j == 3 || j == 4 || j == 2) && i == 7)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void patternK() {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= column; j++) {
				if (j == 1 || (i + j) == 6 || (i == 5 && j == 3) || (i == 6 && j == 4) || (i == 7 && j == 5)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void patternL() {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= column; j++) {
				if (j == 1 || i == 7) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void patternO() {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= column; j++) {
				int sum = i + j;
				if ((j == 1 || i == 7 || j == 7 || i == 1) && (sum != 2 && sum != 8 && sum != 14)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void patternM() {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= column; j++) {
				if (j == 1 || j == 7 || (i == j && i < 5) || ((i + j) == 8) && i < 4) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void patternN() {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= column; j++) {
				if (j == 1 || j == 7 || i == j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void patternT() {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= column; j++) {
				if (j == 4 || i == 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void patternU() {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= column; j++) {
				if ((j == 1 || j == 7) && i < 7 || (i == 7 && (j != 1 && j != 7))) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void patternV() {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= column; j++) {
				if ((j == 1 || j == 7) && i < 5 || ((i + j) == 11) || (i == 5 && j == 2) || (i == 6 && j == 3)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
