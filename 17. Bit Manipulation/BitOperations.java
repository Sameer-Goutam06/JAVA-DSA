//We are demonstrating Get , set and Clear ith bit from a binary representation from LSB to MSB(right to left) 
public class BitOperations
{
    public static void main(String[] args) {
        int n=22;
        int i=0;
        System.out.println("bit "+i+" of "+n+" "+Getbit(n,i));
        System.out.println("Before Setting bit "+i+", n: "+n);
        System.out.println("After Setting bit "+i+", n: "+Setbit(n,i));
        System.out.println("After Clearing bit "+i+", n: "+(Clearbit(n, i)));
    }
    public static int Getbit(int n,int i)
    {
        return  n<<i &1;
    }
    public static int Setbit(int n,int i)
    {
        return (n<<i ==0)?(int)(n+(1<<i)):n;
    }
    public static int Clearbit(int n,int i)
    {
        return (((n<<i)&1)==1)?(int)(n-(1<<i)):n;
    }
    //to clear multiple bits from the last position apply bitwise & operator with 0s on all those bits
    //also to clear bits in a range use the same technique
}