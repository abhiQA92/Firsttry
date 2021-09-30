package overloading;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int row = 6;       
		//Outer loop work for rows  
		for (int i=0; i<row; i++)   
		{  
		//inner loop work for space      
		for (int j=row-i; j>1; j--)   
		{  
		//prints space between two stars  
		System.out.print(" ");   
		}   
		//inner loop for columns  
		for (int j=0; j<=i; j++ )   
		{   
		//prints star      
		System.out.print("* ");   
		}   
		//throws the cursor in a new line after printing each line  
		System.out.println();
			
		
	}*/
		
		String str="Hello World";
		//str.split(str)
		
		int row=6;
		for(int i=0;i<row;i++)
		{
			
			for(int j=row-i;j>1;j--)
			{
				System.out.print(" ");
			}
			
			for(int k=0;k<=i;k++)
				
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}

}
	
}
