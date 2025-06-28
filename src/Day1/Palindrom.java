package Day1;

public class Palindrom {

	public static void main(String[] a) 
	{
	   String ab = "Back to back testing";
	   String Reverse ="";
	   for(int i=ab.length()-1; i>=0; i--)
	   {
		   Reverse=Reverse+ab.charAt(i);
	   }
	   System.out.println("String reverse name is :"+ Reverse);
	   if(Reverse.equals(ab))
	   {
		   System.out.println(" This is palindrom");
	   }
	   else
	   {
		   System.out.println("THis nis not palindrom");
	   }
	   
           
	}
}
