import java.util.*;

class Program14
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Cost Price:");
		double cp = sc.nextDouble();
		System.out.println("Enter the Selling Price:");
		double sp = sc.nextDouble();
				
		if(sp>cp)
		{
			double profit = sp-cp;
			System.out.println("Profit: "+profit);
			double perProfit = (profit*100)/cp;
			System.out.println(" Percentage Profit: "+perProfit+"%");
			
		}
		else if(cp>sp)
		{
			double loss = cp-sp;
			System.out.println("loss: "+loss);
			double perLoss = (loss*100)/cp;
			System.out.println("Percentage Loss: "+perLoss+"%");
			
		}
		
		else 
		{
			System.out.println("There is no loss no profit");
		}
		
	}
}
