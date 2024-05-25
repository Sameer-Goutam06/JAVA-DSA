import java.util.*;
public class Rhombus{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows");
        int n=sc.nextInt();
        System.out.println("Solid Rhombus");
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=n;j++)
            {
                System.out.print("* ");
            }
            for(int j=1;j<i;j++)
            {
                System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println("Hollow Rhombus");
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=n;j++)
            {
                if(i==1 ||i==n ||j==1 ||j==n)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            for(int j=1;j<i;j++)
            {
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}