package programfile;

public class Program58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int n = 1; n <= 1000; n++) {
			int i = n;
			int sum = 0;
			while (i > 0) {
				int fact = 1;
				int rem = i % 10;
				for (int j = rem; j > 0; j--) {
					fact = fact * j;
				}
				sum = sum + fact;
				i = i / 10;
			}
			if (sum == n) {
				System.out.println(n);
			}
		}

	}

}
