//We are going to use bit manipualation for fastest exponentiation
// to calculate a power b
public class FastestExponentiation 
{
    public static void main(String[] args) 
    {
        int a=5;
        int b=3;
        int ans=1;
        while(b>0)
        {
            System.out.println(ans);
            ans=((b&1)==1)?ans*a:ans;
            a*=a;
            b>>=1;
        }
        System.out.println(ans);    
    }    
}
