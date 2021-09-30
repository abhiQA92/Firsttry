package overloading;

public class SplitTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String str = "geekss@for@geekss";
	        String[] arrOfStr = str.split("e", 5);
	  
	        for (String a : arrOfStr)
	            System.out.println(a);
	        
	        String name= "Abhilasha Garima Badhpur";
int count=0;
	        char c='a';
	        char[] ch=name.toCharArray();
	        
	        for(char charray: ch)
	        	
	        {
	        	if(charray==c)
	        	{
	        		count++;
	        	}
	        }
	        
	        System.out.println("The occurence of a in a string is "+count);
	}

}
