class MyStatic
{
	int a;
	static int b;
	MyStatic()
	{
		b++;
	}
	
	public void showData()
	{
		System.out.println("Value of a = " + a);
		System.out.println("Value of b = " + b);
	}
	
	/* public satic void increment()
	 * {
	 * 		a++;
	 * }
	 */
}
