package Arrays;

public class Array2 {

	public static void main(String[] args) 
	{
		
		int a[]={2,3,44,32,55,67,32,66,78,45};
		
		int evenCount=0;
		int oddCount=0;
				
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				evenCount++;
			}
			else
			{
				oddCount++;
			}
					
		}
		System.out.println(evenCount);
		System.out.println(oddCount);
		
	}

}
