class QP3L
{
	public static void main(String args[])
	{
		for(int i=1;i<=6;i++)
		{
			for(int s=5;s>=i;s--)
			{
				System.out.print(" ");
			}
			
			if(i==1 || i==6)
				{
					for(int j=1;j<=i;j++)
					{
					System.out.print("* ");
					}
				}				
			else
			{
				for( int k=1;k<=i;k++)
				{
					if( k==1 || k==i)
						System.out.print("* ");
					else
						System.out.print("  ");
				}
			
			}
			System.out.println();
		}
	}
}