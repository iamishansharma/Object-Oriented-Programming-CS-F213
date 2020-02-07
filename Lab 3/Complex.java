public class Complex
{
	double realPart;
	double imaginaryPart;
	
	//Constructors
	
	public Complex()
	{	
		realPart=0;
		imaginaryPart=0;
	}
	public Complex(double realPart, double imaginaryPart)
	{
		realPart=this.realPart;
		imaginaryPart=this.imaginaryPart;
	}
	public Complex(Double ...c)
	{
		imaginaryPart=0;
	}
	
	//Methods
	
	public Complex Add(Complex otherNumber)
	{
		Complex add=new Complex();
		System.out.println(realPart + " " + otherNumber.realPart);
		System.out.println(imaginaryPart + " " + otherNumber.imaginaryPart);
		add.realPart = realPart + otherNumber.realPart;
		add.imaginaryPart = imaginaryPart + otherNumber.imaginaryPart;
		return add;
	}
	public Complex Subtract(Complex otherNumber)
	{
		Complex sub=new Complex();
		sub.realPart = realPart - otherNumber.realPart;
		sub.imaginaryPart = imaginaryPart - otherNumber.imaginaryPart;
		return sub;
	}
	public Complex Multiply(Complex otherNumber)
	{
		Complex mul=new Complex();
		mul.realPart = (realPart*otherNumber.realPart) - (imaginaryPart*otherNumber.imaginaryPart);
		mul.imaginaryPart = imaginaryPart*otherNumber.realPart + realPart*otherNumber.imaginaryPart;
		return mul;
	}
	public Complex Divide(Complex otherNumber)
	{
		Complex div=new Complex();
		double term1, term2;
		double term3, term4;
		term1 = (realPart*otherNumber.realPart)/((otherNumber.realPart*otherNumber.realPart)+(otherNumber.imaginaryPart*otherNumber.imaginaryPart));
		term2 = (imaginaryPart*otherNumber.imaginaryPart)/((otherNumber.realPart*otherNumber.realPart)+(otherNumber.imaginaryPart*otherNumber.imaginaryPart));
		div.realPart = term1 + term2;
		term3 = (imaginaryPart*otherNumber.realPart)/((otherNumber.realPart*otherNumber.realPart)+(otherNumber.imaginaryPart*otherNumber.imaginaryPart));
		term4 = (realPart*otherNumber.imaginaryPart)/((otherNumber.realPart*otherNumber.realPart)+(otherNumber.imaginaryPart*otherNumber.imaginaryPart));
		div.imaginaryPart = term3 - term4;
		return div;
	}
	
	//Accessor and Mutators
	
	public void setRealPart(double realPart)
	{
		this.realPart=realPart;
	}
	public void setImaginaryPart(double imaginaryPart)
	{
		this.imaginaryPart=imaginaryPart;
	}
	public void getRealPart()
	{
		System.out.println(this.realPart);
	}
	public void getImaginaryPart()
	{
		System.out.println(this.imaginaryPart);
	}
}
