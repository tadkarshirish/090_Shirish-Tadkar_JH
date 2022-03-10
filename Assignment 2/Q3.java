import java.util.Scanner;
class Q3
{
	public static void main(String args[])
	{
		int num1,num2,result;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Number : ");
		num1=sc.nextInt();
		System.out.print("Enter The Divisor : ");
		num2=sc.nextInt();
		result=num1/num2;
		System.out.print("Diving "+num1+" by "+num2+" we get the result = " +result);
}}
