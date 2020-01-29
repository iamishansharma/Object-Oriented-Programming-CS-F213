import java.util.Scanner;
class Example2 
{
    public static void main(String args[])
    {
		//variable declaration
	    int num1;
	    double double1;
	    String numStr1, numStr2;

		/* instantiate scanner class by passing System.in to its constructor */

		Scanner in = new Scanner(System.in);

		System.out.println("Enter an integer: ");
		num1 = in.nextInt(); //reads an int from keyboard 
		System.out.println("You entered: " + num1);

		System.out.println("Enter a double: "); 
		double1=in.nextDouble();//reads an int from keyboard 
		System.out.println("You entered: " + double1);
		
		System.out.println("Enter your name name: "); 
		numStr1 = in.next();
		System.out.println("Your first name is: " + numStr1);
		
		System.out.println("Enter your surname");
		numStr2 = in.nextLine();
		System.out.println("Your surname is: " + numStr2);
     
    }// End of main() method

}// End of class Example2