// A constructor:Initializes objects - Same name as class - No return type - Called automatically


class Student{
    String name;
    int age;
    // Default constructor
    Student(){
        // System.out.println("Default constructor");
        name = "Raahat";
        age=25;
    }

    void display(){
        System.out.println(name+" "+age);
    }
}
public class Constructor {
    public static void main(String[] args) {
       Student s1 = new Student();
    //    s1.name = "Rahat";
    //    s1.age = 24; 
       s1.display();
    }
}
