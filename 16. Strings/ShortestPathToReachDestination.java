public class ShortestPathToReachDestination
{
    public static void main(String[] args) {
        String str="WNEENESENNN";
        int x=0,y=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='E')
            {
                x++;
            }
            else if(str.charAt(i)=='W')
            {
                x--;
            }
            else if(str.charAt(i)=='N')
            {
                y++;
            }
            else
            {
                y--;
            }
        }
        System.out.println((int)Math.sqrt(x*x+y*y));
    }
}