import java.util.*;

public class Leapyear{
    /**
     * @param args
     */
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter an year:");
            int year= sc.nextInt();
            if(year%4==0){
                if(year%100==0){
                    if(year%400==0){
                        System.out.println("It is a leap year");
                    }
                    else{
                        System.out.println("Not a leap year");
                    }
                }
                else{
                    System.out.println("It is a Leap year");
                }
            }
            else{
                System.out.println("Not a leap year");
            }
        }
    }
}