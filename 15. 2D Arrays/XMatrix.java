import java.util.*;

public class XMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        boolean flag=true;
        for(int i=0;i<n;i++)
        {
            if(arr[i][i]>0 && arr[i][n-i-1]>0)
            {
                for(int j=0;j<i;j++)
                {
                    if(arr[i][j]!=0)
                    {
                        flag=false;
                        break;
                    }
                }
                for(int j=n-i-1;j<n;j++)
                {
                    if(arr[i][j]!=0)
                    {
                        flag=false;
                        break;
                    }
                }
            }
            else
            {
                flag=false;
                break;
            }
        }
        System.out.println(flag);
        sc.close();
    }
}