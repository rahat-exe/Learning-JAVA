

interface ClassMethods{
    void display();
}

class ClassRoom {
    int roomNumber;

    ClassRoom(int r){
        roomNumber = r;
    }
}
class Students extends ClassRoom implements ClassMethods{
    String name;
    int age;
    Students(int r,String n, int a){
        super(r);
        name=n;
        age=a;
    }
    public void display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(roomNumber);

    }
}


public class Inheritence {
    public static void main(String args[]){
        
        Students s1 = new Students(5, "Rahat", 24);
        s1.display();
    }
}
