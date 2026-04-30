// A class is a blueprint used to create objects.
class Student{
    String name;
    int age;

    // a method is a function inside class
    void display(){
        System.out.println(name+" "+age);
    }
}

public class ClassExample {
    // An object is an instance of class
    public static void main(String[] args) {
       Student s1 = new Student();
       s1.name = "Rahat";
       s1.age = 24; 
       s1.display();

       Student s2 = new Student();
        s2.name = "Omor";
        s2.age = 29;
        s2.display();
    }
    

}