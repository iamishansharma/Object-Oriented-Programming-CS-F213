class FourToThree
{
	public static void main(String[] args) 
	{
		int num=Integer.parseInt(args[0]);
		int array[];
		array = new int[4];
		for(int i=0; i<4; i++)
		{
			array[i]=num%10;
			num=num/10;
		}
		int num3=0;
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<4; j++)
			{
				for(int k=0; k<4; k++)
				{
					if(i!=j && j!=k && i!=k)
					{
						num3=(array[i]*100) + (array[j]*10) + (array[k]);
						System.out.println(num3);
					}
				}
			}
		}
	}
}