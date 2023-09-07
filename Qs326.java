//convert calcius to fahrenheit 
import java.util.Scanner;
public class Qs326 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the calcius");
        float celcius=sc.nextInt();
        float fahrenheit=(celcius*9/5)+32;
        System.out.print("convert calcius to fahrenheit :=" +fahrenheit);
    }
    
}
