import java.util.*;
//Insertion sort has O(n^2) time complexity
public class InsertionSort 
{
    public static void main(String[] args)
     {
        int[] arr = {12, 11, 13, 5, 6};
        System.out.println(Arrays.toString(insertionSort(arr)));
    }
    public static int[] insertionSort(int[] arr)
    {
        int n = arr.length;
        for(int i=1;i<n;i++)
        {
            int curr=arr[i];//storing the value in tmeporary space
            int prev=i-1;//The curr number needs to compare itself with arr[prev]
            while(prev>=0 && arr[prev]>curr)//we are checking if curr is minimum than arr[prev]
            {
                arr[prev+1]=arr[prev];
        //if it is true then the space of curr in arr will be occupied by arr[prev]
                prev--;
        //the position is decremented and is checked till index is greater than or equal to 0 the point where the loop stops would be recorded
            System.out.println("In prev loop: "+Arrays.toString(arr));
            }
            arr[prev+1]=curr;
        // the position where the loop stopped could be at negeatives due to decrementation so we are palcing curr at one space forward to it
            System.out.println("After prev loop: "+Arrays.toString(arr)+" "+ i);
        }
        return arr;
    }    
}
