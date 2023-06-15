package programfile;

public class Program97 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = {1,2,3,4,5,6,7,8,9,0};
		int[] arr2 = new int[arr1.length];
		//arr2 = arr1.clone();
		//arr2=arr1;
		for(int i=0;i<arr1.length;i++)
		{
			arr2[i]=arr1[i];
			System.out.println(arr2[i]);
		}
		System.out.println(arr2);
		System.out.println(arr1);
	}

}
