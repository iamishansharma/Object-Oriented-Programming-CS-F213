import java.io.*; // java.io package is imported // for using BufferedReaderclass

class Example1
{

	public static void main(String args[]) throws IOException
	{ 
		/* instantiate InputStreamReader class and pass System.in to its constructor */
		InputStreamReader isr = new InputStreamReader(System.in);
		
		/* instantiate Buffered Reader class and pass the reference variable isr 
		which id of type Input Stream Reader created in the previous 
		line to the constructor of Buffered Reader */
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter Your Name: ");

		/* call readLine method on br reference variable which is 
		of type BufferedReader */
		String name = br.readLine();
		System.out.println("Your name is: " + name); 

	} // End of main

} // End of class Example1