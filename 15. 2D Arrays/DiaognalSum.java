
public class DiaognalSum {
    public static void main(String[] args) 
    {
        int[][] matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int d1=0,d2=0;
        for(int i=0;i<matrix.length;i++)
        {
            d1+=matrix[i][i];
            d2+=matrix[i][matrix.length-i-1];
        } 
        int DiaognalSum=(((matrix.length)&1)==0)?(d1+d2):(d1+d2-matrix[matrix.length/2 -1][matrix.length/2 -1]);
        System.out.println(DiaognalSum);  
    }   
}
