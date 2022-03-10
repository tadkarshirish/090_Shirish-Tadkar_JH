class QP36
{
	public static void main(String args[])
	{
		for(int i=9;i>=1;i--)
		{
			for( int j=9;j>=i;j--)
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<=(i*2)-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}