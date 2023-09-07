import java.util.Scanner;
public class Qs1 {
    public static void main(String []args){
        float basic,hra,da,allow,pf;char a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the basic  salary ");
         basic=sc.nextFloat();

         System.out.print("enter the grade");
         char grade =sc.next().charAt(0);


         hra=basic*(20f/100);
         da=basic*(50f/100);
         pf=basic*(11f/100);

         //GROSS SALARY = BASIC+HRA+DA-PF;

         if(grade=='A'){
            float gross=(basic+((basic*20)/100)+((basic*50/100))+1700-((basic*11/100)));
            System.out.print("gross salary="+gross);
         }

            else if(grade=='B'){
            float  gross=basic+((basic*20)/100)+((basic*50/100))+1500-((basic*11/100));
            System.out.print("gross salary="+gross);
         }
         else if (grade =='C'){ 
           float gross =basic+((basic*20)/100)+((basic*50/100))+1100-((basic*11/100));
         System.out.print("gross salary="+gross);
         }

        }
    }










