package scripts;


		class Evensum
		{
		public static void main(String args[])
		{
		int sum=0;
		for(int i=1;i<=100;i++)
		{
		if(i %2== 0)
		{
		sum=sum+i;
		}
		}
		System.out.println("Sum of all even numbers from 1-100 is " +sum);
		}
		}

