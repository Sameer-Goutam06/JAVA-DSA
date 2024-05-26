import java.util.*;
//condition to be added to claculate trapping water
//minimum of (left side maximum height bar , right side maximum height bar)-height of the bar >0
public class TrappingRainWater 
{
    public static void main(String[] args) 
    {
        int[] heights={4,2,0,6,3,2,5};
        int n=heights.length;
        int[] prefix=new int[n];
        int[] suffix=new int[n];
        int prefixmax=0,suffixmax=0;
        int trappedwater=0;
        for(int i=0;i<n;i++)
        {
            prefixmax=(prefixmax<heights[i])?heights[i]:prefixmax;
            suffixmax=(suffixmax<heights[n-i-1])?heights[n-i-1]:suffixmax;
            prefix[i]=prefixmax;
            suffix[n-i-1]=suffixmax;
        }
        for(int i=0;i<n;i++)
        {
            trappedwater+=((prefix[i]<suffix[i])?prefix[i]:suffix[i])-heights[i];
        }
        System.out.println(trappedwater);
    }    
    //other way using while loop
    public int trap(int[] height)
     {
        int l = 0, r = height.length - 1;
        int leftMax = height[l], rightMax = height[r];
        int total = 0;
        //using the method to find maximum element in an array we are traversing from both sides 
        //calculating the maximum between left and right without using any array (leftMax,rightMax)
        //
        while (l < r) {
            if(leftMax <= rightMax) {
                l++;
                leftMax = Math.max(leftMax, height[l]);
                total += leftMax - height[l];
            } else {
                r--;
                rightMax = Math.max(height[r], rightMax);
                total += rightMax - height[r];
            }
        }
        return total;
    }
}