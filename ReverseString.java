package overloading;

public class ReverseString {

	
	public static void main(String[] args) {
	
		ReverseString.main(4);
		String name="Abhilasha Gupta";
		char ch;
		String rev="";
		int size=name.length();
		System.out.println(size);
		for(int i=size-1;i>=0;i--)
		{
			
			ch=name.charAt(i);
			rev=rev+ch;
			
		}
		
		System.out.println(rev);

	}
	
public static void main(int a) {
	
		
		System.out.println(a);
	

		
}
}
