class LaptopDriver 
{

	public static void main(String[] args) 
	{
		Laptop l1 = new Laptop();
		l1.Laptop("Dell",54444,8);
		l1.displayLaptop();
		System.out.println("==========");
		Laptop l2 = new Laptop();
		//l2.setValue("HP",35000,16);
		l2.displayLaptop();	
	}
}