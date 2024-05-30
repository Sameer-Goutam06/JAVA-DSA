// When a string is created in Java, it occupies memory in the heap. Also, we know that the String class is immutable. Therefore, whenever we create a string using the new keyword, 
// new memory is allocated in the heap for corresponding string, which is irrespective of the content of the array. Consider the following code snippet.
// String str = new String("Welcome to JavaTpoint.");   
// String str1 = new String("Welcome to JavaTpoint");  
// System.out.println(str1 == str); // prints false  
// The println statement prints false because separate memory is allocated for each string literal. 
//Thus, two new string objects are created in the memory i.e. str and str1. that holds different references.

// public class InternExample{  
//     public static void main(String args[]){  
//     String s1=new String("hello");  
//     String s2="hello";  
//     String s3=s1.intern();//returns string from pool, now it will be same as s2  
//     System.out.println(s1==s2);//false because reference variables are pointing to different instance  
//     System.out.println(s2==s3);//true because reference variables are pointing to same instance  
//     }}  
public class Assignment 
{ //Example of String Buffer
    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append(" ");
        sb.append("world");
        String message = sb.toString();
        System.out.println(message);
    }
}
