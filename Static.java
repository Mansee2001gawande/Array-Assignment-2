public class Static {
       Static(){
        System.out.println("static constructor");
       } 
    static {
        System.out.println("static block executed");
    }
    {
        System.out.println("initiallizer block");
    }          
    public static void main(String[] args) {
        Static obj =new Static();
    }
}

