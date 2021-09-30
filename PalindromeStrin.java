package overloading;

import java.util.Arrays;

public class PalindromeStrin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="World";
		
		char[] charray= str.toCharArray();
		Arrays.sort(charray);
		
		for(int i=0;i<str.length();i++)
		{
			System.out.println(charray[i]);
		}
		String rev="";
		char ch;
		int size= str.length();
		for(int i=size-1;i>=0;i--)
			
		{
			
			ch=str.charAt(i);
			rev=rev+ch;
			
		}
System.out.println(rev);
	
	
	if(str.equals(rev))
	{
		
		System.out.println("String is palindrome");
	}

	else
	{
		System.out.println("String is not palindrome");
	}
}
	
}
