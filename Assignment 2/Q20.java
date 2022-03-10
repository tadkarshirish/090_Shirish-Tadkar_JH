import java.util.*;

class Q20
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		String S="";
		
		System.out.println("Enter The Number :");
		int num1=sc.nextInt();
		
		while(num1>0)
		{
			int m=num1%2;
			num1=num1/2;
			S=S+m;
		}
			int index=S.length();
			System.out.println(index);
		
		for (int i=index-1;i>=0;i--)
		{
			System.out.print(S.charAt(i));
		}
		
		
		
	}
}
	
		