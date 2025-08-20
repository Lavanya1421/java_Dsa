package LANG;

import java.util.Arrays;

public class move_zeros {
static void move_zeros_method(int arr[])
		{  
			int n=arr.length;
			int temp[]=new int[n];
			int j=0;
			for(int i=0;i<n;i++)
			{
				if(arr[i]!=0)
				{
					
				   temp[j]=arr[i];
				   j++;
				   
				}
			}
			while (j < n) {
	            temp[j] = 0;
	            j++;
	        }
			for(int num:temp)
			{
				System.out.println(num);
				
			}
		}
			public static void main(String args[])
			{
		       int arr[]= {2,4,0,5,0,5};
		       //Arrays.sort(arr);
		       move_zeros_method(arr);	
		
	}

}
