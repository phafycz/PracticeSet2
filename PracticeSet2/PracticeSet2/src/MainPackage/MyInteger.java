package MainPackage;

public class MyInteger 
{
	private int value;

	public MyInteger(int value)
	{
		this.value = value;

	}
	public int getValue()
	{
		return value;
	}

	public boolean isEven()
	{
		if(this.value % 2 == 0)
		{
			return true;
		}
		else
		{
			return false; 
		}
	}
	public static boolean isEven(int value)
	{
		if(value % 2 == 0)
		{
			return true;
		}
		else
		{
			return false; 
		}
	}
	public static boolean isEven(MyInteger myInt)
	{
		if(myInt.getValue() % 2 == 0)
		{
			return true;
		}
		else
		{
			return false; 
		}
	}
	public boolean isOdd()
	{
		if(this.value % 2 == 1)
		{
			return true;
		}
		else
		{
			return false; 
		}
	}
	public static boolean isOdd(int value)
	{
		if(value % 2 == 1)
		{
			return true;
		}
		else
		{
			return false; 
		}
	}
	public static boolean isOdd(MyInteger myInt)
	{
		if(myInt.getValue() % 2 == 1)
		{
			return true;
		}
		else
		{
			return false; 
		}
	}
	public boolean isPrime()
	{
		for(int j = 2; 2*j < this.value; j++){
			if (this.value % j==0)
				return false;
		}
		return true;
	}
	public static boolean isPrime(int value)
	{
		for(int j = 2; 2*j < value; j++){
			if (value % j==0)
				return false;
		}
		return true;
	}
	public static boolean isPrime(MyInteger myInt)
	{
		for(int j = 2; 2*j < myInt.getValue(); j++){
			if (myInt.getValue() % j==0)
				return false;
		}
		return true;
	}
	public static boolean equals(int value, int a)
	{
		if(value==a)
		{
			return true;
		}
		else
			return false;
	}
	public static boolean equals(MyInteger myInt, int a)
	{
		if(myInt.getValue() == a)
		{
			return true;
		}
		else 
			return false;
	}
	public static int parseInt(char[] b)
	{
		int charToInt = Integer.parseInt(new String(b));
		return charToInt;
	}
	public static int parseInt(String c)
	{
		int stringToInt = Integer.parseInt(c);
		return stringToInt;
	}
	
}
