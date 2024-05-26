import java.util.*;

public class ArraysIntroduction
{
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        //Creating an array
        int[] numbers=new int[]{1,2,3,4,5};
        int[] numbers1={1,2,3};
        String[] names={"Sameer","Arshad","Balu"};
        int sum=ArraySum(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println("Sum of numbers array is "+sum);
        System.out.println("Original Array: "+Arrays.toString(numbers1));
        System.out.println("Its reverse is: "+Arrays.toString(reverseArray(numbers1)));
    }
    //passing arrays as arguments
    //we just need to keep square brackets beside argument datatypes
    public static int ArraySum(int[] n)
    {
        int sum=0;
        for(int i=0;i<n.length;i++)
        {
            sum+=n[i];
        }
        return sum;
    }
    //to find a maximum number in an array we can use Math.max() method to compare two elements of same datatypes 
    //we need to use Math.max() method in every element of an array to find out maximum element
    //O(n) Time Complexity
    public static int[] reverseArray(int[] n)
    {
        for(int i=0;i<(n.length)/2 +1;i++)
        {
            int temp=n[i];
            n[i]=n[n.length - i- 1];
            n[n.length - i- 1]=temp;
        }
        return n;
    }
}