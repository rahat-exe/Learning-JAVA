interface A{
    void show();
}
interface B extends A{
    void display();
}
class Example implements B{
    public void show(){
        System.out.println("Hello");
    };
    public void display(){
        System.out.println("World");
    };
}
class Example2 implements A,B{
    public void show(){
        System.out.println("Hello");
    };
    public void display(){
        System.out.println("World");
    };
    
}
// like we can inherit a class from another class, we can inherit an interface from another interface using extends
public class ExtendingInterfaces {
    public static void main(String[] args) {
        Example e = new Example();
        e.show();
        e.display();

        Example2 e1 = new Example2();
        e1.show();
        e1.display();
    }
}


// Class extends one class✅ Class extends multiple classes❌
// Interface extends one interface✅ Interface extends multiple interfaces✅
// Class implements one interface✅ Class implements multiple interfaces✅