import java.lang.*;

class Q13
{
	public static void main(String args[])
		{
			for(int i=65;i<=70;i++)
			{
				for(int j=i;j<=70;j++)
				{
					System.out.print(" ");
				}
				for(int k=65;k<=i;k++)
				{
					System.out.print((char)i+" ");
				}
				System.out.println();
			}
		}
}