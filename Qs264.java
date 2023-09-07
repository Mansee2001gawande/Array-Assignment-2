//factorial
import java.util.Scanner;
public class Qs264 {
    public static void main(String []args){
        int fact=1;
        Scanner sc=new Scanner (System.in);
        System.out.print("enter the no");
        int no =sc.nextInt();
        for(int i=1;i<=no;i++){
            fact=fact*i;
             }
         System.out.print(fact);





    
}
}
