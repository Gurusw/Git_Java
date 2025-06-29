package Day2;

public class NumberOfDigitsInString 
{
	
	public void number()
	{
		int count=0;
		String str="12gutru234";
		for(int i=0; i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
			count++;
			}
		}
		System.out.println(count);	
	}
    public static void main(String[] args) 
	{
		NumberOfDigitsInString inr= new NumberOfDigitsInString();
		inr.number();
	}
}
