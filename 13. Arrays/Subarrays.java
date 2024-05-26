//for every array of length n there is a n(n+1)/2 subarrays 
//it is equivalent to pairs method
import java.util.*;
public class Subarrays {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    System.out.print(arr[k]+ " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        //maximum subarrays sum
        //we are doing this with O(n) time complexity
        //we are comapring the maximum sum which is declared as Integer.MIN_VALUE
        //so -ve values are considered maximum than maximum sum at initial
        //kadanes algorithm
        int[] nums = {2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Nums array: "+Arrays.toString(nums));
        System.out.println(max_subarray_sum(nums));
    }
    public static int max_subarray_sum(int[] arr)
    {
        int maxsum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            maxsum=(maxsum<sum)?sum:maxsum;
            sum=(sum<0)?0:sum;
        }
        return maxsum;
    }
}
