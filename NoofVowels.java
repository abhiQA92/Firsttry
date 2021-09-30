package overloading;

public class NoofVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Etiquette is necessary";
		char ch;
		int count=0, count1=0;
		char[] c= name.toCharArray();
		
		for(char n: c)
		{
			if(n=='a'|| n== 'e' || n=='i' || n=='o' || n=='u' || n=='A' || n== 'E'|| n=='I' || n=='O' || n=='U')
				
			{
				count++;
				
			}
			
			else
			{
				count1++;
			}
		}
		
		System.out.println("Number of vowels is "+count);
		System.out.println("Number of consonants is "+count1);

	}

}
