interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Bark");
    }
}

public class InterfaceExp {
    public static void main(String[] args) {
       Dog d = new Dog();
       d.sound(); 
    }
}
