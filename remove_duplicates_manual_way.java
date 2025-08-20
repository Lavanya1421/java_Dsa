package LANG;

import java.util.Arrays;

class remove_duplicates_manual_way {
	
	static void method_remove_duplicates (int arr[])
	{  
		int n=arr.length;
		int temp[]=new int[arr.length];
		int j=0;
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
		   temp[j]=arr[i];
			j++;
		}
			
	}
		temp[j++]=arr[arr.length-1];
		System.out.println("remove duplicates");
  for(int i=0;i<j;i++)
  {
	  System.out.println(temp[i]);
  }
  /*for (int num : Arrays.copyOfRange(temp, 0, j)) {
		System.out.println(num);
	}*/
}
	public static void main(String args[])
	{
       int arr[]= {2,4,2,5,4,5};
       Arrays.sort(arr);
       method_remove_duplicates(arr);
       
	}
}