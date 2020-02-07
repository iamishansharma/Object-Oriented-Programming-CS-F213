public class WrapperTest
{
	public static void main(String[] args) 
	{
		Integer I = new Integer(10);
		Integer J = new Integer(20);
		
		//Observe the output for following two statments carefully
		
		System.out.println(I.intValue());
		System.out.println(I);
		
		//Observe the output for the following two statements carefully
		
		System.out.println(J.intValue());
		System.out.println(J);
		
		Integer K1 = new Integer(I.intValue() + J.intValue());
		
		// What happends for the following statement (Auto Unboxing)
		
		Integer K2 = I + J + K1; 
		System.out.println(K2);
	}
}
