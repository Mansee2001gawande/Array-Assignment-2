import java.util.Scanner;
public class Qs2bonus {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
            System.out.print("enter your sales");
            int sales=sc.nextInt();
             if(sales>10000) {
             float bonus=sales*(20f/100);
             float salary =sales+bonus;

             System.out.print("your salary adding bonus"+salary);
              } else
             System.out.print("you are not eligible for bonus");
            } 
}
