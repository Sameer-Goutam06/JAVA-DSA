public class StringBuilderIntro 
{
    public static void main(String[] args) 
    {
        StringBuilder sb=new StringBuilder("");
        //to create a alphabetical string
        for(char ch='a';ch<='z';ch++)
        {
            sb.append(ch);
        }
        System.out.println(sb);
        //Question: convert first letter of each word to uppercase
        String str="hi, i am sameer";
        StringBuilder st=new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            char ch=(i==0 || str.charAt(i-1)==' ')? Character.toUpperCase(str.charAt(i)) :str.charAt(i);
            st.append(ch);
        }
        System.out.println(st);
    }
}
