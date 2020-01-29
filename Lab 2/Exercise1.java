import java.io.*;

class Exercise1
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.printf("Enter numbers seperated by space: ");
		String s = br.readLine();
		String newS[]=s.split(" ");
		int sum=0;
		for(int i=0; i<10; i++)
		{
			sum += Integer.parseInt(newS[i]);
		}	
		System.out.println("The sum is: " + sum);
	}
}