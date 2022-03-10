import java.util.Scanner;
class Q6
{
public static void main(String args[])
{
	int num1,num2,add,sub,multi,div;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter The First Number");
	num1=sc.nextInt();
	System.out.println("Enter The Second Number");
	num2=sc.nextInt();
	System.out.println("Addition of "+num1+" + "+num2+" is "+(add=num1+num2));
	System.out.println("Substraction of "+num1+" - "+num2+" is "+(add=num1-num2));
	System.out.println("Multiplicatipn of "+num1+" * "+num2+" is "+(add=num1*num2));
	System.out.println("Division of "+num1+" / "+num2+" is "+(add=num1/num2));
	System.out.println("Modulus of "+num1+" % "+num2+" is "+(add=num1%num2));
	}}