package programfile;

import java.util.Arrays;

public class Program106 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {2,4,8,1,6,9};
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		arr=sortArray(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static int[] sortArray(int[] arr)
	{
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}

}
