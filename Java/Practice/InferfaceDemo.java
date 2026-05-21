interface Demo1{
    void show();
}
interface Demo2{
    void display();
}
// class example is doing multiple inhieritance using interfaces
class Example implements Demo1, Demo2{
    public void show(){
        System.out.println("Hello");
    }
    public void display(){
        System.out.println("World");
    }
}

// public class InferfaceDemo {
//     public static void main(String[] args) {
//         Example e = new Example();
//         e.show();
//         e.display();
//     }
// }

class InterfaceDemo implements Demo1, Demo2{
    public void show(){
        System.out.println("Hello");
    }
    public void display(){
        System.out.println("World");
    }
    public static void main(String[] args) {
        Example e = new Example();
        e.show();
        e.display();
    }
}
