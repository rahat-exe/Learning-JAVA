
class Student{
    String name;
    int age;
    // Parameterized constructor
    Student(String n, int a){
       name = n;
       age = a;
    }

    void display(){
        System.out.println(name+" "+age);
    }
}
public class Constructor2 {
    public static void main(String[] args) {
       Student s1 = new Student("Omor", 24);
    //    s1.name = "Rahat";
    //    s1.age = 24; 
       s1.display();
    }
}


