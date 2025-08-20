package LANG;

public class check_sort {
 public static void sorting(int arr[])
 {
	 for(int i=0;i<arr.length-1;i++)
	 {
		 if(arr[i]>arr[i+1])
		 {
			 System.out.println("array is not sorted");
			 return;
		 }
	 } 
			 System.out.println("array is  sorted");
		 
	 }
 
 
 public static void main(String args[])
 {
	 int arr[]= {4,5,60,7,8};
	 sorting(arr);
 }
}
