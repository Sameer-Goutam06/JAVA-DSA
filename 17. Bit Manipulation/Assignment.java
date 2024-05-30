import java.util.*;
//value of x^x for any value of x is 0
public class Assignment 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //swap two variables without using any third variable
        System.out.println("Enter first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter second number: ");
        int b = scanner.nextInt();
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("Swapped a: "+a+" b:"+b);
        // add 1 to an integer using bit manipulation
        System.out.println("Enter an integer");
        int x = scanner.nextInt();
        System.out.println((-(~x)));//decrypting 2s complement
        //convert uppercase to lowercase using bit manipulation
        for(char ch='A';ch<='Z';ch++)
        {
            ch=((char)(ch |' '));
            System.out.print(ch);
        }
        scanner.close();
    }
}
