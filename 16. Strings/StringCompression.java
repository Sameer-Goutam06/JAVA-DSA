public class StringCompression 
{
    public static void main(String[] args)
    {
        StringBuilder str=new StringBuilder();
        String string="aabbcccdddddeeeffaa";
        for(int i=0;i<string.length();i++)
        {
            int count=1;
            while(i<string.length()-1 && string.charAt(i)==string.charAt(i+1))
            {
                count++;
                i++;
            }
            str.append(string.charAt(i));
            str.append(count);
        }
        System.out.println(str);    
    }    
}
