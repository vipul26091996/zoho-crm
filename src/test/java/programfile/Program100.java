package programfile;

import java.util.Arrays;

public class Program100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int index = 3;
		int[] arr2 = new int[arr.length - 1];
		for (int i = 0; i < arr.length; i++) {
			if (i == index) {
				for (int j = i; j < arr.length - 1; j++) {
					arr2[j] = arr[j + 1];
				}
				break;
			}
			arr2[i] = arr[i];
		}
		System.out.println(Arrays.toString(arr2));

	}

}
