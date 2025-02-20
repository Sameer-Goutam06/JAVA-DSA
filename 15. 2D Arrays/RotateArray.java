import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[] temp=new int[matrix[0].length];
        int n=4;
        for (int i=0; i<matrix.length/2; i++)
        {
            temp=matrix[i];
            matrix[i]=matrix[n-i-1];
            matrix[n-i-1]=temp;
        }
        for(int i=0;i<matrix.length;i++)
        {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}