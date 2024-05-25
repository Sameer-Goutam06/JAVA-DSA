import java.util.*;
public class HalfPyramidStars {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            StringBuilder res=new StringBuilder();
            for(int j=1;j<=n;j++)
            {
            if(j>(n-i))
            {
                res.append("*");
            }
            else
            {
                res.append(" ");
            }
            }
            System.out.println(res);
        }
    }
}