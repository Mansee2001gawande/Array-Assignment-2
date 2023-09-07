/*write a program to find sum of all integers greater than 100 and less than 200 there */
import java.util.Scanner;
public class Qs3 {
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
        int sum=0;
        System.out.print("enter the no");
        int no=sc.nextInt();
        for(int i=101;i<=200;i++){
            if(i%7==0) 
            sum=sum+i;
        }
        System.out.println("Sum: "+sum);
        
    }
    
}
