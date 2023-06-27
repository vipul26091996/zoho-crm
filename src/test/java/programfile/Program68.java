package programfile;

public class Program68 {

	static int row = 7;
	static int column = 6;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		patternH();
		System.out.println("===============================");
		patternD();
		System.out.println("===============================");
		patternE();
		System.out.println("===============================");
		patternF();
		System.out.println("===============================");
		patternQ();
		System.out.println("===============================");
		patternR();
		System.out.println("===============================");
		patternP();
		System.out.println("===============================");
		patternS();
		System.out.println("===============================");
		patternG();
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
			for (int j = 1; j <= 6; j++) {
				if ((j == 1 || j == 5) && (i != 1 && i != 7) || ((i == 1 || i == 7) && (j != 1 && j < 5))
						|| ((i == 5 && j == 4) || ((i + j) == 13))) {
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
			for (int j = 1; j <= 6; j++) {
				if ((j == 1 || (j == 6 && (i == 2 || i == 3))) || ((i == 1 || i == 4) && j < 6)
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
			for (int j = 1; j <= 6; j++) {
				if ((j == 1 || (j == 6 && (i == 2 || i == 3)) || ((i == 1 || i == 4) && j < 6))) {
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

}
