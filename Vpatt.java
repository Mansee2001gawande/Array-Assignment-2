/*import java.util.Scanner ;
public class Vpatt {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the last characterof pattern");
        char ch=sc.next().charAt(0);
        for(char i=ch;i>='A';i--){
            for(char j='A';j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    } 
    
} */

import java.util.Scanner;
public class Vpatt{
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.print("enter the no:=");
        int no=Sc.nextInt();

        for(int i=no;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(+(char)(j));
            }
            System.out.println();

        }
    }
}