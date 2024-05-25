import java.util.Scanner;

public class ReverseNumber{
    public static void main(String args[]){
        int n,rev=0,rem=0;
        try (Scanner s = new Scanner(System.in)) {
            System.out.format("enter a number:");
            n=s.nextInt();
        }
        while(n>0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.println(rev);
    }
}