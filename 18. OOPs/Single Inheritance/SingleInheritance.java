class Employee
{
    float salary=34534*12;
}
public class SingleInheritance extends Employee
{
    float bonus=3000*6;
    public static void main(String args[])
    {
        SingleInheritance obj=new SingleInheritance();
        System.out.println("Total salary credited: "+obj.salary);
        System.out.println("Bonus of six months: "+obj.bonus);
    }
}