class Program7
{
	public static void main(String[] args)
	{
		int sum=0;
		int i=1;
		while(i<=500)
		{	
			if(i%7==0 && i%10==7)
			{
				sum = sum + i;
			}
			
			i++;
		}
	System.out.println(sum);
	}
}