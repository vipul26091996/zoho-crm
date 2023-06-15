package programfile;

public class Program64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int f0 = 0;
		int f1 = 1;
		int f2;
		System.out.print(f0 + " " + f1);
		for (int i = 1; i < 50; i++) {
			int count = 0;
			f2 = f0 + f1;
			System.out.print(" " + f2);
			f0 = f1;
			f1 = f2;
			while (f2 > 0) {
				int rem = f2 % 10;
				if (rem >= 0) {
					count++;
				}
				f2 = f2 / 10;
			}
			if (count == 10) {
				System.out.println(" Count(" + count + ")");
				break;
			}
		}

	}

}
