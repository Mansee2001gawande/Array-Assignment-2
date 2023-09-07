    import java.util.Scanner;
public class Search {
    public static void main(String[] args) {
        boolean flag=true;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the array length:=");
        int length=sc.nextInt();

        int a[]=new int [length];

        System.out.print("enter array elements:=");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
         }

         System.out.print("enter the array serach:=");
        int search=sc.nextInt();

        for(int i=0;i<a.length;i++){
            if(search==a[i])
            flag=true;
             break;
        }
         
        if(flag==false){
      System.out.print("element is not found"+search);
        } else
        
        System.out.print("element is  found"+a[i]);
    }
}