package LANG;
public class bubble_sort {
	
	public static void sorting(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
	{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
	} 
		System.out.println("sorted array :");
		for( int num:arr)
		{
		//System.out.println("sorted array :");
		System.out.println(num);
		}
	// print largest element 
		System.out.println("the largest element is "+ arr[arr.length-1]);
		int largest=Integer.MIN_VALUE;
		//Integer  slargest= null;
		int slargest = Integer.MIN_VALUE;
		for( int num:arr)
		{
			if (num > largest) {
		        slargest = largest; // previous largest becomes second largest
		        largest = num; 
			}
		     else if(largest >slargest&& slargest!=largest)
		{ 
			slargest=num;
		}
		}
			System.out.println("Second largest element is: " + slargest);
	    	
		
	}
	
	
	public static void main(String args[])
	{
		int arr[]= {4,7,2,1,8,4,6};
		sorting(arr);
	}

}
