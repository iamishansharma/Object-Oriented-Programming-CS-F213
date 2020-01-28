
public class HarmonicSum
{ 
	public static void main (String[] args) 
	{
		int maxDenominator = 50000;
		double sumL2R = 0.0; // sum from left-to-right 
		double sumR2L = 0.0; // sum from right-to-left
		// for-loop for summing from left-to-right 
		for (int denominator = 1; denominator <= maxDenominator; denominator++) 
		{
			sumL2R += (double) 1/denominator;
		}
		for (int denominator = maxDenominator; denominator >= 1; denominator--) 
		{
			sumR2L += (double) 1/denominator;
		}
		System.out.println("Sum L to R is: " + sumL2R);
		System.out.println("Sum R to L is: " + sumR2L);
		System.out.println("Difference L to R and R to L is: " + (sumL2R-sumR2L));
	}
}
