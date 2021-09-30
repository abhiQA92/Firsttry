package overloading;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {45,43,24,86,16,48};

int large=arr[0];

for(int i=0;i<arr.length;i++)
	
{
	if(arr[i]>large)
		
	{
		large=arr[i];
	}

	
	
}
	
	System.out.println("The largest number in series is "+large);
		
	
}
	}


