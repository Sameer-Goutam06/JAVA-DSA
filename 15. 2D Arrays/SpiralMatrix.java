public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        //traverse through the matrix in spiral way
        int startRow=0,endRow=matrix.length -1,startCol=0,endCol=matrix[0].length -1;
        while(startRow<=endRow && startCol<=endCol)
        {
            //top traversal
            for(int i=startCol;i<=endCol;i++)
            {
                System.out.print(matrix[startRow][i]+" ");
            }
            //right to bottom traversal
            for(int i=startRow+1;i<=endRow;i++)
            {
                System.out.print(matrix[i][endCol]+" ");
            }
            //botttom to left traversal
            if(startRow<endRow)
            {
                for(int i=endCol-1;i>=startCol;i--)
                {
                    System.out.print(matrix[endRow][i]+" ");
                }
            }
            //left to top-1 traversal
            if(startCol<endCol)
            {
                for(int i=endRow-1;i>=startRow+1;i--)
                {
                    System.out.print(matrix[i][startCol]+" ");
                }
            }
            startRow++;
            startCol++;
            endCol--;
            endRow--;
        }
    }
}
