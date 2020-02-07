class stest 
{
	private static String[] String;
	static
	{
		System.out.println("1.%");
	}

	public static void main1(String args) 
	{
		System.out.println("2.@");
	}
	static 
	{
		System.out.println("3.&");
	}
	static
	{
		System.out.println("4.~");
	}
	static
	{
		System.out.println("5.$");
	}
}
class Exercise1
{	
	public static void main(String[] args) 
	{
		stest.main1(args);
		stest.main1(new String());
		System.out.println("6.#");
	}
}
