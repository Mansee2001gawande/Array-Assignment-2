import java.util.Scanner;
public class Test4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("enter your salary");
        int salary=sc.nextInt();
        System.out.println("enter working hours");
        int hours=sc.nextInt();

     /*    if(salary < 50000 && hours <= 6){
            int salary1 = salary + 10000;
            System.out.println("first if salary "+salary1);

        }
            else if (salary < 50000 && hours > 6){    //r
                int salary2 =salary+10000;
                int salary3 =salary2+5000;
                System.out.println("second if salary "+salary3);

            }
             else if (salary >=50000 && hours >6){
            int total = salary +5000;
            System.out.println(total);
             }
            else if (salary >50000 && hours <6)
            System.out.println("your total salary is "+salary); */

           if(salary < 50000){
            int salary1= salary + 10000;
            System.out.println(salary1);
           }
           else if (hours > 6){
            int salary2 = salary +5000;
            System.out.println(salary2);
           }
           else if (salary < 50000 && hours >6){
                int salary3 =salary+10000;
                int salary4 =salary3+5000;
                System.out.println(salary4);
           }
           else if(salary > 50000 && hours < 6){
                System.out.println("you are not eligible for insentive");
            }


        }
    }

