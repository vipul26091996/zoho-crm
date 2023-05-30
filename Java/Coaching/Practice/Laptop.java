class Laptop 
{
	String name;
	int price;
	int ram;
	Laptop(String n,int p,int r)
	{
		name = n;
		price = p;
		ram = r;
	}
	Laptop()
	{

	}
	public void displayLaptop()
	{
		System.out.println("Name is: "+name);
		System.out.println("Price is: "+price);
		System.out.println("RAM is: "+ram);
	}
	
}