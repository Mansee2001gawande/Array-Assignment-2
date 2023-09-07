import java.util.Scanner;
public class Qs265 {
    public static void main(String []args){
        int prime=0;
        Scanner Sc=new Scanner(System.in);
        System.out.print("enter the no");
        int no=Sc.nextInt();
        for( no=1;no<=100;no++){
        for(int  j=2;j<100;j++){

            if(no%j==0){
            prime=prime+1;
         }
        }
        if(prime==0){
             System.out.print(" "+no);
        }
        else
        prime=0;
             

        }
    }
}

