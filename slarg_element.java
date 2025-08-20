package LANG;
class slarg_element {
public static void main(String args[])
{      
			      int arr[] = {4, 7, 2, 1, 8, 4, 6};
			      int largest = arr[0];       // start with first element
			      int secondLargest = arr[0]; // also start with first element
			       for (int i = 1; i < arr.length; i++) 
			        {
			          if (arr[i] > largest) 
			           {
			                secondLargest = largest; // previous largest becomes second largest
			                largest = arr[i];       // update largest
			            }
			          else if (arr[i] > secondLargest && arr[i] != largest)
			            {
			                secondLargest = arr[i]; // update second largest
			            }
			        }

			        System.out.println("Second largest element is: " + secondLargest);
			    }
			}