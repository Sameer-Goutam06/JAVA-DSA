public class SearchInSortedMatrix 
{
    public static void main(String[] args) 
    {
        // a sorted matrix is increasing when it is traversed through rows and also through columns
        int[][] matrix={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int row=0,column=matrix[0].length-1;
        int key=33;
        boolean found=false;
        while(row<matrix.length && column>=0)
        {
            if(matrix[row][column]==key)
            {
                found=true;
                System.out.println("Key found at matrix["+row+"]["+column+"]");
                break;
            }
            else if(key<matrix[row][column])
            {
                column--;//we are checking if element is present at left which are lower than the present one
            }
            else
            {
                row++;
            }
        }
        if(!found)
        {
            System.out.println("Key not in matrix");
        }
    }    
}
