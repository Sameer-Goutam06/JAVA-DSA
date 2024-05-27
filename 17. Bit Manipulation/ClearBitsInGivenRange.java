//to clear bits in i to j range we can use a loop from i to j positions from right to left and Apply Bitwise AND(&) with 0
//Now there is another way using Bitwise NOT(~) and Bitwise OR(|) which conserves the time and space 
//Variable int n
//Variable a int
//~(0) in 8 bit representation would be 11111111
//applying a left shift operation on ~0 would be making all the 1s to 0s till the ith position form LSB
//for example(~0)<<4 would reult in 11110000
//a=(~0)<<(j+1)
//Variable b int
//Now we need to calculate the left part of 1s exactly by using (1<<i)-1 (to give the exact range before a power of 2)
//Result variable will be ((Bitwise OR of a and b)&(n))  (a|b)&n
//100111010011 i=2 j=7
//a= 111100000000
//b= 000000000011
//100100000011 & 100111010011 =10010000000011
//Other example in code :
// 347
// 101011011
// 323
// 101000011
public class ClearBitsInGivenRange
{
    public static void main(String[] args) {
        int n=347;
        int i=2,j=5;
        System.out.println(n);
        System.out.println(DecToBin(n));
        int res=(((~0)<<j+1)|((1<<i)-1))&n;
        System.out.println(res);
        System.out.println(DecToBin(res));
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