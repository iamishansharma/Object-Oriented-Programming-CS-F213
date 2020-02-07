import java.io.*;
import java.util.Scanner;

public class ComplexDemo 
{
	public static void main(String[] args)
	{
			Complex c1=new Complex();
			Complex c2=new Complex();
			Complex c3=new Complex();
			System.out.println("Welcome to Complex Calculator");
			int i=0;
			System.out.println("\nEnter your choice: ");
			System.out.println("\n1. Add");
			System.out.println("2. Subtract");
			System.out.println("3. Multiply");
			System.out.println("4. Divide");
			Scanner sc=new Scanner(System.in);
			i=sc.nextInt();
			if(i==1)
			{
				System.out.println("For first number in a + ib format - ");
				System.out.println("Enter a");
				c1.realPart=sc.nextDouble();
				System.out.println("Enter b");
				c1.imaginaryPart=sc.nextDouble();
				
				System.out.println("For second number in a + ib format - ");
				System.out.println("Enter a");
				c2.realPart=sc.nextDouble();
				System.out.println("Enter b");
				c2.imaginaryPart=sc.nextDouble();
				
				c3=c1.Add(c2);
				
				System.out.println("Result is: " + c3.realPart + " + i" + c3.imaginaryPart);
			}
			else if(i==2)
			{
				System.out.println("For first number in a + ib format - ");
				System.out.println("Enter a");
				c1.realPart=sc.nextDouble();
				System.out.println("Enter b");
				c1.imaginaryPart=sc.nextDouble();
				
				System.out.println("For second number in a + ib format - ");
				System.out.println("Enter a");
				c2.realPart=sc.nextDouble();
				System.out.println("Enter b");
				c2.imaginaryPart=sc.nextDouble();
				
				c3=c1.Subtract(c2);
				
				System.out.println("Result is: " + c3.realPart + " + i" + c3.imaginaryPart);
			}
			else if(i==3)
			{
				System.out.println("For first number in a + ib format - ");
				System.out.println("Enter a");
				c1.realPart=sc.nextDouble();
				System.out.println("Enter b");
				c1.imaginaryPart=sc.nextDouble();
				
				System.out.println("For second number in a + ib format - ");
				System.out.println("Enter a");
				c2.realPart=sc.nextDouble();
				System.out.println("Enter b");
				c2.imaginaryPart=sc.nextDouble();
				
				c3=c1.Multiply(c2);
				
				System.out.println("Result is: " + c3.realPart + " + i" + c3.imaginaryPart);
			}
			else if(i==4)
			{
				System.out.println("For first number in a + ib format - ");
				System.out.println("Enter a");
				c1.realPart=sc.nextDouble();
				System.out.println("Enter b");
				c1.imaginaryPart=sc.nextDouble();
				
				System.out.println("For second number in a + ib format - ");
				System.out.println("Enter a");
				c2.realPart=sc.nextDouble();
				System.out.println("Enter b");
				c2.imaginaryPart=sc.nextDouble();
				
				int ch=0;
				
				System.out.println("Enter your choice: ");
				System.out.println("1. c1 / c2 ");
				System.out.println("2. c2 / c1");
				ch=sc.nextInt();
				if(ch==1)
				{
					if(c2.realPart==0 || c2.imaginaryPart==0)
					{
						System.out.println("Dividing by zero not valid");
					}
					else
					{	
						c3=c1.Divide(c2);
						System.out.println("Result is: " + c3.realPart + " + i" + c3.imaginaryPart);
					}
				}
				else if(ch==2)
				{
					if(c1.realPart==0 || c1.imaginaryPart==0)
					{
						System.out.println("Dividing by zero not valid");
					}
					else
					{	
						c3=c2.Divide(c1);
						System.out.println("Result is: " + c3.realPart + " + i" + c3.imaginaryPart);
					}
				}
				else
				{
					System.out.println("Invalid input");
				}
			}
			else
			{
				System.out.println("Invalid Choice");
			}
	}
}
