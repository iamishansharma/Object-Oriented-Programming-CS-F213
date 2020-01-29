import java.util.Scanner;

class Exercise1
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int sum=0;
		for(int i=0; i<10; i++)
		{
			System.out.printf("Enter number [%d]: \n",(i+1));
			sum += input.nextInt();
		}	
		System.out.println("The sum is: " + sum);
	}
}