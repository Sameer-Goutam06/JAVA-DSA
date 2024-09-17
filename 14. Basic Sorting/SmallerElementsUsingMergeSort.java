// Smaller Elements 
// You are given an array of integers. For each element in the array, find the number of smaller elements on the right side and print the total count.
// Input Format
// The first line of input contains T - the number of test cases. It's followed by 2T lines, the first line contains N - the size of the array. The second line contains the elements of the array.
// Output Format
// For each test case, print the sum of count of smaller elements on right side of each element in the array, separated by new line.
// Constraints
// 30 points
// 1 <= N <= 10^3
// 70 points
// 1 <= N <= 10^5
// General Constraints
// 1 <= T <= 100
// -10^4 <= A[i] <= 10^4
// Example
// Input
// 2
// 5
// 4 10 54 11 8
// 6
// 15 35 25 10 15 12
// Output
// 4
// 10
import java.util.*;
public class SmallerElementsUsingMergeSort {
    static int cnt=0;
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        while(tc-->0)
        {
            cnt=0;
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            DC1(arr,0,n-1);
            System.out.println(cnt);
        }
        sc.close();
    }
    public static void DC1(int[] arr,int low,int high){
        if(low==high) return;
        int mid=(low+high)/2;
        DC1(arr,low,mid);
        DC1(arr,mid+1,high);
        DC2(arr,low,mid,high);
    }
    public static void DC2(int[] arr,int low,int mid,int high)
    {
        int p1=low,p2=mid+1,k=0;
        int[] temp=new int[high-low+1];
        while(p1<=mid && p2<=high)
        {
            if(arr[p1]<=arr[p2])
            {
                temp[k++]=arr[p1++];
            }
            else
            {
                System.out.println(Arrays.toString(Arrays.copyOfRange(arr, p1, mid+1)));
                System.out.println(Arrays.toString(Arrays.copyOfRange(arr, p2, high+1)));
                cnt+=(mid-p1+1);
                temp[k++]=arr[p2++];
            }
        }
        while(p1<=mid)
        {
            temp[k++]=arr[p1++];
        }
        while(p2<=high)
        {
            temp[k++]=arr[p2++];
        }
        for(int i=0;i<k;i++)
        {
            arr[low+i]=temp[i];
        }
    }
}