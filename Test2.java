import java.util.Scanner;
class Test2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of an array");
        int length = sc.nextInt();
        
        int a[]=new int [length];
        System.out.println("enter array elements");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }

        int min=a[0];
        int max=a[0];

        for(int i=0;i<a.length;i++){
            if(a[i]<min){
            min=a[i];
        }   else if (a[i]>max){
            max=a[i];
        }
    }

        System.out.print("max"+max);
        System.out.print("min"+min);

    }

    }
