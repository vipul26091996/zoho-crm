package programfile;

public class Program63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 50; i++) {
			int prime = 0;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					prime++;
				}
			}
			if (prime == 0) {
				System.out.println(i);
			}
		}

	}

}
