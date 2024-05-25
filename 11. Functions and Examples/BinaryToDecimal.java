//we are trying to convert Binary to Decimal using normal check in java
import java.util.*;
public class BinaryToDecimal {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Binary Number: ");
        String s=sc.next();
        System.out.println(BinToDec(s));
    }
    public static long BinToDec(String s)
    {
        long result=0;
        char c='1';
        for(int i=s.length() -1;i>=0;i--)
        {
            if (s.charAt(i)==c){
                result+=Math.pow(2,i);
            }
        }
        return result;
    }
}
