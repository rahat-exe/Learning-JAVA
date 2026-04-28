
class Person{
    String name;
    int age;
    int income;

    // methods
    void Greet(){
        System.out.println("Hello "+name);
    }
}

class Person1 {
    String name;
    int age;
    int income;
    Person1(){
        name = "Unknown";
        age = 0;
        income = 0;
    }
    Person1(String n, int a, int i){
        name = n;
        age = a;
        income = i;
    }

    void Greet() {
        System.out.println("Hello " + name);
    }
    void Display(){
        System.out.println("NAME: "+name);
        System.out.println("AGE: " + age);
        System.out.println("INCOME: " + income);

    }
}


public class Class {
    public static void line(){
        System.out.println("-------------------------------------------------------------------");
    }
  public static void main(String[] args) {
    // Person p = new Person();
    // p.name = "Rahat";
    // System.out.println(p.name);
    // p.Greet();

    Person1 p1 = new Person1();
    p1.Display();

    line();

    Person1 p2 = new Person1("Rahat", 24, 10000);
    p2.Display();
  }  
}
