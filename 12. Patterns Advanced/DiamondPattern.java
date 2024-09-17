import java.util.*;
public class DiamondPattern {
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        System.out.println("Diamond Pattern");
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=(2*i)-1;j++)
            {
                System.out.print("* ");
            }
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("  ");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=(2*i)-1;j++)
            {
                System.out.print("* ");
            }
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Hollow diamond pattern");
        for(int i=n;i>0;i--)
        {
            String res="* ".repeat(i)+"  ".repeat(2*(n-i))+"* ".repeat(i);
            System.out.println(res);
        }
        for(int i=1;i<=n;i++)
        {
            String res="* ".repeat(i)+"  ".repeat(2*(n-i))+"* ".repeat(i);
            System.out.println(res);
        }
        sc.close();
    }
}
