
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int[] ans=Arrays.copyOf(arr,n);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            
            for(int k=0;k<n;k++)
            {
                if (k!=n-1)
                System.out.print(arr[k]+" ");
                else
                System.out.print(arr[k]);
            }
            if(Arrays.equals(ans,arr))
            {
                break;
            }
            System.out.println();
            ans=Arrays.copyOf(arr,n);
        }
        sc.close();
    }
}