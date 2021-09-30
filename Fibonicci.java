package overloading;

public class Fibonicci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//- 0 1 1 2 3 5 8 13 21 34
		
		int a=0;
		int b=1;
		int temp=0;
		int n=10;
		int i=0;
		System.out.println("First number "+a);
		System.out.println("Second number "+b);
		while(n>i)
		{
			temp=a+b;
			System.out.println(temp);
			a=b;
			b=temp;
			
			i++;
			}
	}

}
