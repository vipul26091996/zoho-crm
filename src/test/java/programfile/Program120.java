package programfile;

import java.util.Arrays;

public class Program120 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 6, 7, 8, 28, 19 };
		int temp;
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(arr[0] + " " + arr[arr.length - 1]);

	}

}
