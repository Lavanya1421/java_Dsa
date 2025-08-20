package LANG;
import java.util.HashSet;
public class remove_duplicates
{
    public static void main(String[] args) {
        int arr[] = {4, 7, 2, 4, 8, 7, 1};

        HashSet<Integer> uniqueSet = new HashSet<>();

        // Add elements to HashSet (duplicates will be ignored)
        for (int num : arr) {
            uniqueSet.add(num);
        }

        // Print unique elements
        System.out.print("Array without duplicates: ");
        for (int num : uniqueSet) 
        {
            System.out.print(num + " ");
        }
    }
}
        