import java.util.StringTokenizer;

public class Address
{
	private String line1, line2, line3, pin;
	private char[] city = new char[30];
	private char[] state= new char[30];
	public Address(String add)
	{
		StringTokenizer stz=new StringTokenizer(add,"$");
		 while(stz.hasMoreTokens())
		 {
			 line1=stz.nextToken();
			 line2=stz.nextToken();
			 line3=stz.nextToken();
			 city=stz.nextToken().toCharArray();
			 state=stz.nextToken().toCharArray();
			 pin=stz.nextToken();
		 }
	}
	public String getLine1()
	{
		return line1;
	}
	public String getLine2()
	{
		return line2;
	}
	public String getLine3()
	{
		return line3;
	}
	public String getCity()
	{
		String cityName = new String(city);
		return cityName;
	}
	public String getState()
	{
		String stateName = new String(state);
		return stateName;
	}
	public String getPin()
	{
		return pin;
	}
}
class AddressList
{
	public static int countAddressWithCity(Adress[] addressList, String city)
	{
		
	}
	public static int countAddressWithPin(Adress[] addressList, String strP)
	{
		
	}
	public static Address[] getAddressWithCity(Adress[] addressList, String city)
	{
		
	}
	public static Address[] getAddressWithPin(Adress[] addressList, String strP)
	{
		
	}
}