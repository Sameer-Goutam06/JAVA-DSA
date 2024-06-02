public class ConstructorIntro 
{
    @SuppressWarnings("unused")
    public static void main(String[] args)
    {
        Student s1=new Student();
        Student s2=new Student("John",20);
        Student s3=new Student(s2);
    }
}
class Student
{
    String name;
    int rno;
    //constructor Without argument
    Student()
    {
        System.out.println("Welcome to Student class");
        System.out.println("No arguments taken");
    }
    //constructor with arguments
    Student(String name,int rno)
    {
        this.name=name;
        this.rno=rno;
        System.out.println("Arguments taken");
        System.out.println("name: "+name);
        System.out.println("Roll no: "+rno);
    }
    //copy constructor
    //copies values of an object
    //this is shallow
    //changes will reflect if changed in object considered
    Student(Student s)
    {
        this.name=s.name;
        this.rno=s.rno;
        System.out.println("Arguments copied from s2");
        System.out.println("name: "+name);
        System.out.println("Roll no: "+rno);
    }
    
}