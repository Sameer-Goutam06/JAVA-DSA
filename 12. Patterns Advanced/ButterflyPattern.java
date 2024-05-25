import java.util.*;
public class ButterflyPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            StringBuilder sb=new StringBuilder();
            for(int j=1;j<=i;j++)
            {
                sb.append("* ");
            }
            for(int j=i+1;j<=(2*n)-i;j++)
            {
                sb.append("  ");
            }
            for(int j=i;j>=1;j--)
            {
                sb.append("* ");
            }
            System.out.println(sb);
        }
        for(int i=n;i>=0;i--)
        {
            StringBuilder sb=new StringBuilder();
            for(int j=1;j<=i;j++)
            {
                sb.append("* ");
            }
            for(int j=i+1;j<=(2*n)-i;j++)
            {
                sb.append("  ");
            }
            for(int j=i;j>=1;j--)
            {
                sb.append("* ");
            }
            System.out.println(sb);
        }
    }

}