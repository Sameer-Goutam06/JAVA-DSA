//given an unique array of elements or set
//for a set of numbers we are given a sum of a subset
//so we need to check if that subset sum exists or not
import java.util.*;
public class SubsetSumExists {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int subsetSum=sc.nextInt();
    boolean flag=false;
    int[] arr=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    int[] sum=new int[(int)Math.pow(2,n)];
    for(int i=0;i<(int)Math.pow(2,n);i++)
    {
        sum[i]=0;
        for(int j=0;j<n;j++)
        {
            int num=i>>j;
            if((num&1)==1)
            {
                sum[i]+=arr[j];
            }
        }
        if(sum[i]==subsetSum)
        {
            flag=true;
            break;
        }
    }
    System.out.println((flag)?"Exists":"not Exists");
    sc.close();
}
}
