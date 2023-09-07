public interface Shape {
public abstract void m1();

}
class Circle implements Shape{
public void m1(){
    System.out.println("circle m1 called ");
}
}
class Rectangle implements Shape{
public void m1(){
    System.out.println("rectangle m1 called ");
}
}
class Main{
    public static void main(String[] args) {
    Shape obj =new Rectangle(); 
    obj.m1();
    Shape on=new Circle();
    on.m1();
    }
}

