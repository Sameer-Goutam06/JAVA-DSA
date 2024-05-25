//There are several ways to check prime numbers
//we can check if more than two factor exists between 1 to n 
//we can check if no factor exists between 2 to n-1
//also we can reduce it to check for no factor between 2 to (n/2)+1
//Optimal way is to use a loop to check if the number is divisible by any number between 2 and the square root of the number 
//The optimal way is to count all the number of primes in a range of 1 to n is given by "Sieve of Eraosthenes"

import java.util.*;

public class isPrime {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        long n=sc.nextInt();
        List<Long> l=new ArrayList<>();
        for(long i=2;i<n;i++)
        {
            if (isPrime(i)){
                l.add(i);
            }
        }
        System.out.println(l);
    }
    public static boolean isPrime(long n)
    {
        for(long i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
