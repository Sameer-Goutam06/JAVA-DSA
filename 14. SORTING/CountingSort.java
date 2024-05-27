import java.util.*;
//counting sort is a method used for only positive numbers 
//it requires a range of numbers from 0 to largest number in the array
//Best Time complexity O(n) Average and worst O(nlogn)
public class CountingSort
{
    public static void main(String[] args) 
    {
        int[] arr={2,3,4,1,5,2,4,2,6,7,1,4,2,3};
        int largest=0;
        for(int i=0;i<arr.length;i++)
        {
            largest=Math.max(largest,arr[i]);
        }
        int[] count=new int[largest+1];
        for(int i=0;i<arr.length;i++)
        {
            count[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++)
        {
             while(count[i]>0)
             {
                arr[j]=i;
                j++;
                count[i]--;
             }
        }
        System.out.println(Arrays.toString(arr));
    }
}