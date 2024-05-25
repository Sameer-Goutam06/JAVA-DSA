import java.util.*;
public class FloydsTriangle 
{
    @SuppressWarnings("resource")
    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        int x=1;
        System.out.println("Floyds Triangle");
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(x++);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("0-1 Triangle");
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {   
                int res=((i+j)%2)==0 ?1:0;
                System.out.print(res);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
