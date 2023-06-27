package programfile;

public class Program104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {3,5,7,0,2,9};
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
		System.out.println();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0+i;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
		
	}

}
