import java.util.Scanner;
class Q12
{ 	
	public static void main(String args[])
	{
		int num1,num2,num3,average;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first number : ");
		num1=sc.nextInt();
		System.out.println("Enter the second number : ");
		num2=sc.nextInt();
		System.out.println("Enter the third number : ");
		num3=sc.nextInt();
		average=(num1+num2+num3)/3;
		System.out.println("Average of three numbers is  "+average);
	}
}