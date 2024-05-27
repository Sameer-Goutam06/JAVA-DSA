public class PowerOf2 {
    public static void main(String[] args) 
    {
        int n=256;
        int count=0;
        boolean power=true;
        while(n>0)
        {
            count=(((n>>1)&1)==1)?count+1:count;
            if(count>1)
            {
                power=false;
                break;
            }
            n>>=1;
        }
        System.out.println(power);
    }
}
