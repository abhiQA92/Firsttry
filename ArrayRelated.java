package overloading;

public class ArrayRelated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {34,12,43,67,21,10};
		int smallest=arr[0];
		int size= arr.length;
		System.out.println(size);
		
		for(int i=0;i<size;i++)
		{
			if(arr[i]<smallest)
			{
				smallest=arr[i];
			}
		}
		
		System.out.println(smallest);
System.out.println("Changes to check");

	}

}
