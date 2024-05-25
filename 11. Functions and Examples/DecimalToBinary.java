import java.util.*;
public class DecimalToBinary {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number: ");
        long n=sc.nextInt();
        System.out.println(DecToBin(n));
    }
    public static StringBuilder DecToBin(long n)
    {
        StringBuilder bin=new StringBuilder();
        while(n>0)
        {
            bin.append(n%2);
            n/=2;
        }
        return bin.reverse();
    }
}