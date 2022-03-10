class QP7
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{	
				System.out.print(" ");
			}
			
			for( int j=1;j<=(i*2-1)&&i<=5;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
			for(int l=4;l>=1;l--)
			{
				for(int k=5;k>=l;k--)
				{
				System.out.print(" ");
				}
				for(int m=1;m<=(l*2-1);m++)
				{
				System.out.print("*");
				}
				System.out.println();
			}
			
		
		
	}
}