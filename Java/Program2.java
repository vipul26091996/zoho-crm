class Test
{


	public static void main(String[] args)
	{
		int a=10;
		     a++;
		int b = a--;
		int c = --a;
		b++;
		--c;
		int d = --a + a++ + --c;
		System.out.println(a);		
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

		//a=9 b=12 c=7 d=23


	}
}