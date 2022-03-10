import java.util.Scanner;

class QP17a
{
	public static void main(String args[])
	{
		for(int i=1;i<=6;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			if(i==1 || i==6)
			{
				for( int k=1;k<=i;k++)
				{
					System.out.print("*");
				}
			}
			else
			{
				for(int j=1;j<=i;j++)
				{
					if(j==1 || j==i)
					{
						System.out.print("*");
					}
					else
						System.out.print(" ");
				}  
			}
			System.out.println();
		}
	}
}