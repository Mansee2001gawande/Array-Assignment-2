import java.util.Scanner;
class Sort{
    public static void main(String[] args) {
        int i,j,temp;
        int a[]=new int [4];
        Scanner sc=new Scanner(System.in);
        System.out.print("enter elements sort series");
        for( i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for(i=0;i<a.length;i++){
            for(j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("after sorting");
        for(i=0;i<a.length;i++){
            System.out.println("value ="+a[i]);
        }

        }

    }
