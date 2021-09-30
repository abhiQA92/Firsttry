package overloading;

public class CountingChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name= "Abhilasha Gupta";
		String str1="Abhi";
		String str2="Abhi";
		String abc="wealth";
		char val='a';
		int ASCIIvalue= val;
		System.out.println(ASCIIvalue);
		String a=abc.substring(0, 1);
		String rem= abc.substring(1, abc.length());
		String first=a.toUpperCase();
		String full= first+rem;
		System.out.println(full);
		
		if(str1.equals(str2))
		{
			
			System.out.println("Same");
		}
		int count=0;
		char ch;
		int i=0;
		int size=name.length();
		System.out.println(size);
while(i<size)
{
ch=name.charAt(i);
count++;
i++;

}

System.out.println(count);
	}

}
