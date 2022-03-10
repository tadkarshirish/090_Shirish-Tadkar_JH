import java.util.*;
class Q11
{ 	
	public static void main(String args[])
	{
		final double pi=3.1415;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the radius of circle");
		double rad=sc.nextDouble();
		System.out.println("perimeter is "+(double)(2*rad*pi));
		System.out.println("area is "+(pi*rad*rad));		
}
}