import java.util.Arrays;

public class MatrixAssignment 
{
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //transpose of a matrix
        int[][] transpose = new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix.length;j++)
            {
                transpose[j][i]=matrix[i][j];
            }
        }
        for(int i=0;i<matrix.length;i++)
        {
            System.out.println(Arrays.toString(transpose[i]));
        }
    }
}
