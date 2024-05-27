import java.util.*;
public class Palindrome 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=sc.nextLine();
        System.out.println(palindrome(str)?str+" is a palindrome":str+ " is not a palindrome");
        sc.close();

    }
    public static boolean palindrome(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=str.charAt(str.length()-i-1))
            {
                return false;
            }
        }
        return true;
    }    
}
