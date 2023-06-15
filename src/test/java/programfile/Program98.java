package programfile;

public class Program98 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		int[] arr2 = new int[arr1.length];
		for (int i = 0, j = arr2.length - 1; i < arr1.length; i++, j--) {
			arr2[j] = arr1[i];
			System.out.println(arr2[j]);
		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}

}
