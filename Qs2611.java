import java.util.Scanner;
public class Qs2611 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the quantity of pizza:= ");
        int pizza=sc.nextInt();
        System.out.print("enter the quantity of puffs:= ");
        int puffs=sc.nextInt();
        System.out.print("enter the quantity of coldrinks:= ");
        int coldrink =sc.nextInt();

        int pizzaTotal =pizza*100;
        int puffsTotal=puffs*20;
        int coldrinkTotal=coldrink*10;

        int Total=pizzaTotal+puffsTotal+coldrinkTotal;

        System.out.print("Total bill is:= "+Total);



    }
    
}
