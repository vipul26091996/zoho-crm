package programfile;

import java.util.Arrays;

public class Program113 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 5, 7, 9, 7, 6, 7 };
		System.out.println(Arrays.toString(arr));
		int count=0;
		int temp=0;
		for (int i = 0; i < arr.length; i++) {
			//count=0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					temp=arr[i];
					count++;
				}
			}
			//System.out.println(arr[i] + " is " + count + " times.");
		}
		
		System.out.println(temp+" == "+count);
	}

}
