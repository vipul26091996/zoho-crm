package programfile;

public class Program30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 10; i <= 200; i++) {
			int num = 0;
			int temp=i;
			while(temp>0)
			{
				int rem=temp%10;
				num=num*10+rem;
				temp=temp/10;
			}
			if(i==num)
			{
				System.out.println(i);
			}
		}

	}

}
