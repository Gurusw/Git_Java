package Day3;

import java.util.Arrays;

public class StringAnnagram {
	public void Anna()
	{
		//S1=SILENT S2=LISTEN if both the strings length and words are same then we call it as anagram
		
		// Step 1 check the length, 2) sort the characters in alphabetical order
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="SILENT", str2="LISTEN";
		str1=str1.replaceAll("","").toLowerCase();
		str2=str2.replaceAll("", "").toLowerCase();
		if(str1.length()==str2.length())
		{
			System.out.println("This will satify the anagram rule, we can proceed with other process");
			
		}
		else
		{
			System.out.println("This is not an anagram");
		}
		//for (int i=0; i<str1.length(); i++)
		{
		char []a=str1.toCharArray(); char b[]=str2.toCharArray();
		//Arrays.sort(a)!=Arrays.sort(b))
		
		
		if (Arrays.equals(a, b))
		{
			System.out.println("This is anagram");
			
		}
			
		else
		{
			System.out.println("this is not an anagram");
		}
		}
	}

	}


