package Day2;

import java.util.Scanner;

public class UserDefineInput 
{

	public static void main(String[] args) 
	{
		int a=32;
		Scanner sf= new Scanner (System.in);
		int b=sf.nextInt();
		int c=0;
		try
		{
		 c=a/b;
		}
		catch(Exception tt)
		{
		System.out.println("Print the output value :"+ c);
		System.out.println(tt.getMessage());
		}
		System.out.println("Print the output value :"+ c);

	}

}
