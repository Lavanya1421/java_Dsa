package patterns;
public class half_pyramid {
public static void main(String args[]) {
int n = 5; // number of rows

	        for (int i = 1; i <= n; i++) 
	        {
	            // print spaces
	      for (int j = 1; j <= n - i; j++) 
	      {
	                System.out.print(" ");
	            }

	            // print stars
	            for (int j = 1; j <= 2 * i - 1; j++) 
	            {
	                System.out.print("*");
	            }

	            System.out.println(); // move to next row
	        }
	       // for(int i=0;i<=n;i++)
	    }
	}
