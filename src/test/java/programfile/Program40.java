package programfile;

public class Program40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 20; i <= 60; i++) {
			if (i % 11 == 0) {
				sum = sum + i;
				System.out.println(i);
			}
		}
		System.out.println(sum);

	}

}
