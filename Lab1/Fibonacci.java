class Fibonacci 
{ 
    public static void main(String[] args) 
    {
    	int n1,n2,n3;
    	float avg;
    	int n = Integer.parseInt(args[0]);
    	n1=0;
    	n2=1;
    	

    	System.out.print(n2);

    	avg = n1 + n2;

    	for(int i=2; i<=n; ++i)
    	{
    		n3=n2+n1;
    		System.out.print(" "+n3);    
		    n1=n2;    
		    n2=n3;
		    avg+=n3;
    	}

    	avg=avg/n;
    	System.out.println("\nAverage is: " + avg);
    }
}