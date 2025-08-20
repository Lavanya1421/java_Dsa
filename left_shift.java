package LANG;

public class left_shift {
	public static void main(String args[]) {
		int arr[]= {2,5,1,6,7};
		int n=arr.length;
		int temp=arr[0];
		for(int i=0;i<n-1;i++)
		{
		   arr[i]=arr[i+1];
		}
		arr[n-1]=temp;
		for(int num :arr)
		{
	System.out.println(num);
	}
	}
}


