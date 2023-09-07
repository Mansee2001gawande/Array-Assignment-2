//check alphabate or consonanat
 import java.util.Scanner;
public class Qs4 {
    public static void main(String []args){
    Scanner sc =new Scanner (System.in);
    System.out.print("enter any character:=");
    char ch=sc.next().charAt(0);
    if((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')||
      (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'))

        System.out.print("character is vowel");
        else
        System.out.print("character is consonant");
    }

    
}
