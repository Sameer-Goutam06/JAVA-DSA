class Halfpyramid{
        public void fun(){
            int x=0,y=0;
            for(x=1;x<=4;x++){
                for(y=1;y<=x;y++){
                    System.out.print(y);
                }
                System.out.println();
            }
        }
    }
class Character{
    public void fun(){
        char ch='A';
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
        System.out.println();    
        }
    }
}
public class Patterns {
    public static void main(String args[]){
        int i=0,j=0;
        for (i=4;i>=1;i--){
            for(j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        Halfpyramid h=new Halfpyramid();
        h.fun();
        System.out.println();
        Character c=new Character();
        c.fun();
    }
}
