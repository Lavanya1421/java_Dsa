package LANG;

public class right_shift {
 public static void main(String args[])
 {
	 		int arr[]= {2,5,1,6,7};
	 		int n=arr.length;
	 		int temp=arr[n-1];
	 		for(int i=n-1;i>0;i--)
	 		{
	 			arr[i]=arr[i-1];
	 		
	 		}
	 		arr[0]=temp;
	 		
	 		for(int num :arr)
	 		{
	 	System.out.println(num);
	 	}
	 	
	 	} 
 }

 