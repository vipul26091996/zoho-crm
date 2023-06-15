package programfile;

public class Program96 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum = 0;
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		double avg = sum / arr.length;
		System.out.println(avg);
	}

}
