    

import java.util.Scanner;
public class Qs271 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("enter the no:-");
        int no=sc.nextInt();
        System.out.print("enter the 2nd no:=");
        int no1=sc.nextInt();
        System.out.print("enter the 3rd no:=");
        int no2=sc.nextInt();

        if(no==20 && no1==20 && no2==20){
            System.out.print("given no is EQUAL TO  20"+no);
            }
                if(no>20 && no1>20 && no2>20){
            System.out.print("given no is greater than 20"+no);
            }

            if(no<20 && no1<20 && no2<20){
            System.out.print("given no is greater than 20"+no);
            }




    }
}