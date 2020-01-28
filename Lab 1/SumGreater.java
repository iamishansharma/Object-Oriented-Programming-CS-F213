class SumGreater
{
	public static void main(String[] args)
	{
		int X=Integer.parseInt(args[args.length-1]);
		int array[];
		int sum;
		array = new int[args.length-1];
		for(int i=0; i<array.length; i++)
		{
			array[i]=Integer.parseInt(args[i]);
		}
		for(int i=0; i<array.length; i++)
		{
			for(int j=0; j<array.length; j++)
			{
				if(j>i)
				{
					sum=array[i]+array[j];
					if(sum==X)
					{
						System.out.println(array[i]+" "+array[j]);
					}
				}
			}
		}
	}
}