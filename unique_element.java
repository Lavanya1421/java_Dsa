package LANG;

public class unique_element {
	public static void main(String args[])
	{
		int arr[]= {2,3,5,5,6,3};
		unique_method(arr);
	}
	static void unique_method(int arr[])
	{  
		int n=arr.length; 
	for(int i=0;i<n;i++)
	{
		int count=0;
    for(int j=1;j<n;j++)
    {
       if(arr[i]==arr[j])
       {
      count++;
      }
    }
    //for(int i=0;i<=j;i++)
       
   if(count==1)
      {
    	  System.out.println(arr[i]);
      }
	}
	}
	}
	

	

