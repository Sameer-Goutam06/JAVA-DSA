//Not working
// Problem Statement:
// For a binary string T, let f(T) = the number of modes† of string T.
// For example, f(101) = 1, as it has a unique mode 1 while f(01) = 2, as it has 2 modes, both 0 and 1.

// Given a binary string S of length N, compute the value of ∑_{L=1}^{N} ∑_{R=L}^{N} f(S[L, R]), where S[L, R] denotes the substring S_L S_{L+1} ... S_R.

// † Mode of a string is the character with maximum frequency. If multiple characters have maximum frequency, all of them are said to be modes. For example, string 111 has mode 1 while string 10 has 2 modes, both 0 and 1.

// Input Format:
// - The first line of input will contain a single integer T, denoting the number of test cases.
// - Each test case consists of multiple lines of input.
// - The first line of each test case contains one integer N - the length of the string.
// - The second line contains a binary string S of length N.

// Output Format:
// For each test case, output on a new line, the required sum.

// Constraints:
// - 1 ≤ T ≤ 10^4
// - 1 ≤ N ≤ 10^5
// - S_i ∈ {0, 1}
// - The sum of N over all test cases does not exceed 10^5.

// Sample 1:
// Input:
// 3
// 2
// 01
// 4
// 0011
// 5
// 10101

// Output:
// 4
// 12
// 21

// Explanation:
// Test case 1:
// f(0) = 1, as it has only 1 mode which is 0.
// f(1) = 1, as it has only 1 mode which is 1.
// f(01) = 2, as both 0 and 1 are modes.
// The total sum is 4.

// Test case 2:
// f(0) = 1, as it has only 1 mode which is 0. The substring 0 has two occurrences in the string.
// f(1) = 1, as it has only 1 mode which is 1. The substring 1 has two occurrences in the string.
// f(00) = 1, as it has only 1 mode which is 0.
// f(01) = 2, as both 0 and 1 are modes.
// f(11) = 1, as it has only 1 mode which is 1.
// f(001) = 1, as it has only 1 mode which is 0.
// f(011) = 1, as it has only 1 mode which is 1.
// f(0011) = 2, as both 0 and 1 are modes.
// The total sum is 12.

import java.util.*;
public class SumOfModes_CC 
{
    //to decode the problem we need to calculate the modes in substrings of a given string
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        int modes=0;
        for(int i=0;i<n;i++)
        {   int s0=0,s1=0;
            for(int j=i;j<n;j++)
            {
                if(s.charAt(j)=='0')
                {
                    s0+=1;
                }
                else{
                    s1+=1;
                }
                if(s0>s1)
                {
                    modes+=s0;
                }
                else if(s1>s0)
                {
                    modes+=s1;
                }
                else
                {
                    modes+=s0+s1;
                }
            }
        }
        System.out.println(modes);
        sc.close();
    }
}
