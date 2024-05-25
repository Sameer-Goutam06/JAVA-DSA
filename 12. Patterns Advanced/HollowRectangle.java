import java.util.*;
public class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Do you also need column value? 'Y' or 'N' ");
        String s=sc.next();
        if (s.equals("Y") || s.equals("y"))
        {
            int m=sc.nextInt();
            Hollow_Rectangle(n,m);
        }
        else{
            Hollow_Rectangle(n);
        }
    }
    public static void Hollow_Rectangle(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if (i==1 || i==n || j==1 || j==n)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }
    public static void Hollow_Rectangle(int n,int m){
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if (i==1 || i==n || j==1 || j==m)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }
}
