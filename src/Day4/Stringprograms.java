package Day4;

public class Stringprograms
{
	//revprivate String a;


	public static void mai(String a)
	{
		String rev="";
		for(int i=a.length()-1; i>=0; i--)
		{
			rev=rev+a.charAt(i);
		}
		System.out.println(rev);
		
	}
	public static void main(String[] args) 
	{
		Stringprograms ad=new Stringprograms();
		 //String a="guru";
		 	// TODO Auto-generated method stub
        ad.mai("guru");
	}

}
