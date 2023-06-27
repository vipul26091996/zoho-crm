package programfile;

import java.util.Arrays;

public class Program118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 2, 5, 1, 3, 8, 6, 9, 7 };
		System.out.println(Arrays.toString(arr));
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = arr.length / 2; i < arr.length; i++) {
			temp = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
