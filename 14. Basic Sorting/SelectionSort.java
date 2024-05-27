//Implementation of selection sort
// in this sorting we need to take the lowest element first and place it at beginning  and the next minimum element after that
//the unsorted part follows the same rule for n times
//It also has O(n^2) time complexity
import java.util.*;
public class SelectionSort
{
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }
    public static int[] selectionSort(int[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n; i++) 
        {
            int minPos=i;
            for(int j=i+1;j<n;j++)
            {
                minPos=(arr[minPos]>arr[j])?j:minPos;
            }
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }
}