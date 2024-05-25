import java.util.*;
public class BinomialCoefficient {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter values of n and r to calculate combinations");
        int n=sc.nextInt();
        int r=sc.nextInt();
        long nCr=binomialCoefficient(n,r);
        if (nCr>0){
            System.out.println("The value of nCr is"+nCr);
        }
        else{
            System.out.println("r must be in between 0 and n");
        }
    }
    public static long binomialCoefficient(int n,int r){
        if (r>n){
            System.out.println("Invalid inputs");
            return 0;
        }
        long result=1;
        long nfact=1,rfact=1,dfact=1;
        for(long i=1;i<=n;i++)
        {
            dfact= (i<=(n-r)) ? dfact*i : dfact;
            rfact= (i<=r) ? rfact*i : rfact;
            nfact*=i;
        }
        result=(nfact)/((rfact)*(dfact));
        return result;
    }
}
