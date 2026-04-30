abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing circle");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.draw();
    }
}


// A class declared with abstract keyword.

// Cannot be instantiated

// May contain abstract methods