import java.util.Scanner;
public class Radius {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("enter radius value:=");
        float r=sc.nextFloat();
        float volume = 4/3*3.14f*r*r;

       if  (r==volume){
        System.out.print("radius is equal to sphere volume"+r);
        }
        else 
        {
         System.out.print("radius is not equal to sphere volume"+r);
   
        }

    }
}
