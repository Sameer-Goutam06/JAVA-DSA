//O(n^2) time complexity
//checks each and every element and swaps it into ascending or to descending

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args)
    {
        int[] arr={5,4,2,1,3};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
    public static int[] bubbleSort(int[] arr)
    {
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
}