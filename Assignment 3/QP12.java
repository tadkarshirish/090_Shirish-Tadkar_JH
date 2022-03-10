class QP12

{
	public static void main(String args[])
	{
		for(int i=1;i<=9;i++)
		{
			for(int j=i;j<=5&&j<6;j++)
			{
				System.out.print("*");
			}
			
			for(int k=5;k<=i&&i>=6;k++)
			{
				System.out.print("*");
			}
			
			System.out.println();
			
			
		}
		
	}
}