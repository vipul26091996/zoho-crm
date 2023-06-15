package programfile;

public class Program89 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 832, 32, 32, 134, 342, 23, 35 };
		int n = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (n >= arr[i]) {
				n = arr[i];
			}
		}

		System.out.println("Smallest number is: " + n);
	}

}
