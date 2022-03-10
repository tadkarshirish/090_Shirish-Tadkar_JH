import java.util.Scanner;
class Q13
{ 	
	public static void main(String args[])
	{
		float hght,wid,area,peri;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the width of rectangle : ");
		wid=sc.nextFloat();
		System.out.println("Enter the height of rectangle : ");
		hght=sc.nextFloat();
		area=wid*hght;
		peri=(2*wid)+(2*hght);
		System.out.println("Area is "+wid+" * "+hght+" = "+area);
		System.out.println("Perimeter is 2*("+wid+" + "+hght+" = "+peri);
	}
}