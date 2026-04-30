// One parent, many children.
class Animal {
    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Meowing");
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.bark();
        d1.eat();

        Cat c1 = new Cat();
        c1.meow();
        c1.eat();
    }
}
