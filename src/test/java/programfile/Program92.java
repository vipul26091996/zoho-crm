package programfile;

public class Program92 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int[] arr = { 31, 32, 32, 3244, 23, 2312, 1, 21, 4 };
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				System.out.println(arr[i]);
				sum = sum + arr[i];
			}
		}
		System.out.println(sum);
	}

}
