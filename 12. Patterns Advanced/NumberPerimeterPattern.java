// Input Format: N = 3
// Result: 
// 3 3 3 3 3 
// 3 2 2 2 3 
// 3 2 1 2 3 
// 3 2 2 2 3 
// 3 3 3 3 3

// Input Format: N = 6
// Result:   
// 6 6 6 6 6 6 6 6 6 6 6 
// 6 5 5 5 5 5 5 5 5 5 6 
// 6 5 4 4 4 4 4 4 4 5 6 
// 6 5 4 3 3 3 3 3 4 5 6 
// 6 5 4 3 2 2 2 3 4 5 6 
// 6 5 4 3 2 1 2 3 4 5 6 
// 6 5 4 3 2 2 2 3 4 5 6 
// 6 5 4 3 3 3 3 3 4 5 6 
// 6 5 4 4 4 4 4 4 4 5 6 
// 6 5 5 5 5 5 5 5 5 5 6 
// 6 6 6 6 6 6 6 6 6 6 6


import java.util.*;

public class NumberPerimeterPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=(2*n)-1;i++)
        {
            for(int j=1;j<=(2*n)-1;j++)
            {
                System.out.print(n-Math.min(Math.min(i,j),Math.min((2*n)-i, (2*n)-j))+1+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
