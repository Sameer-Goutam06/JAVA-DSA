import java.util.*;
public class RangeOfPrimes {
    public static void main(String[] args) {
        int n=1000001;
        int[] arr=new int[n];
        Arrays.fill(arr,1);
        arr[0]=0;
        arr[1]=0;
        for(int i=2;i*i<n;i++)
        {
            if(arr[i]==1)
            {
                for(int j=i*i;j<n;j+=i)
                {
                    arr[j]=0;
                }
            }
        }
        int[] prefix=new int[n];
        prefix[0]=0;
        for(int i=1;i<n;i++)
        {
            prefix[i]=(prefix[i-1]+arr[i]);
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of testcases: ");
        int tc=sc.nextInt();
        while(tc-->0)
        {
            System.out.println("Enter l and r: ");
            int low=sc.nextInt();
            int high=sc.nextInt();
            int count=prefix[high]-prefix[low-1];
            System.out.println("primes in range:"+count);
        }
        sc.close();
    }
}