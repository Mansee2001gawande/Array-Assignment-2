import java.util.Scanner;
public class Test3 {         // test3 = employee
private int salary;
private int workinghours;

Test3 (int salary,int workinghours){
    this.salary=salary;
    this.workinghours=workinghours;
}
public void getsalary(int salary) {
     System.out.print("salary"+salary);
}
public void addSalary(){
    if(salary < 50000){
    salary=salary+10000;
}
}
public void addwork(){
    if(workinghours > 6){
        salary=salary+5000;
    }
}
}
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the salary");
        int salary=sc.nextInt();
        System.out.println("enter workinghours");
        int workinghours =sc.nextInt();

        Test3 obj =new Test3 (salary , workinghours);
       obj.getsalary(salary);
    }
}



