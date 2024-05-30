//codechef starters 136 Questions
// Problem Statement:
// You are given an array A of size N. Your task is to find the size of the largest subarray of A which has an even sum.

// Example:
// For the array [2, 1, 2], the answer is 1 as the largest subarray with an even sum is [2].

// Note:
// A subarray is a contiguous part of an array. For the array [1, 3, 2], some possible subarrays are [1], [2], [1, 3], [1, 3, 2]. However, [1, 2] is not a subarray for this array.

// Input:
// - The first line contains an integer T, the number of test cases.
// - For each test case:
//   - The first line contains an integer N, the size of the array.
//   - The second line contains N space-separated integers representing the elements of the array A.

// Output:
// For each test case, print the size of the largest subarray with an even sum.

// Constraints:
// - 1 ≤ T ≤ 100
// - 1 ≤ N ≤ 10^5
// - -10^4 ≤ A[i] ≤ 10^4

// Example:
// Input:
// 2
// 3
// 2 1 2
// 3
// 1 3 2

// Output:
// 1
// 2
import java.util.*;
public class EvenSumSubarray_CC 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            System.out.println(largestEvenSumSubarray_Quadratic(n,arr));
            System.out.println(largestEvenSumSubarray_Linear(n, arr));
        }
        sc.close();
    }
    //O(n^2)
    public static int largestEvenSumSubarray_Quadratic(int n,int[] arr)
    {
        int maxLen = 0, currSum = 0;
        for(int i=0;i<n;i++)
        {
            currSum = 0;
            for(int j=i;j<n;j++)//Generates subarrays from i to n
            {
                currSum += arr[j];
                maxLen=(((currSum&1)==0) && (maxLen<(j-i+1)))?(j-i+1):maxLen;
                //at each and every step the lrngth of sub arrays is calculated
            }
        }
        return maxLen;
    }
    //O(n)
    public static int largestEvenSumSubarray_Linear(int n,int[] arr)
    {
        int sum=0;
        for(int i = 0;i<n;i++){
	        sum += arr[i];
	    }
	    int i = 0;
	    int j = n-1;
        if (sum%2==0)
            return n;
	    while(arr[i]%2 == 0){
	        i++;
	    }
	    while(arr[j]%2 == 0){
	        j--;
	    }
	    int leftsize = i+1;
	    int rightsize = n - j;
        return Math.max(n-leftsize,n-rightsize); 
    }
}