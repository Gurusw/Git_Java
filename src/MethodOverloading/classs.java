package MethodOverloading;

public class classs
{
	int widght,length;
	classs()
	{
		widght=1;
		length=3;
	}
	void NoPerameter()
	{
		System.out.println("no value is provided here");
	}
	int number()
	{
		return 123;
		
	}
	void addPerameter(String a, int b)
	{
		System.out.println(a+b);
	}
	

}
