// Write a program using inheritance &amp; interfaceto display record of your semester exam marks
// which is based on Internal &amp; End sem exam marks. And IA marks depends on Assignment,
// Attendance &amp; Sessional exam.


// Interface
interface Marks {
    void calculateIA();

    void calculateTotal();
}

// Base class
class Student {
    int assignment, attendance, sessional;

    Student(int a, int att, int s) {
        assignment = a;
        attendance = att;
        sessional = s;
    }
}

// Derived class implementing interface
class Result extends Student implements Marks {
    int endSem;
    int ia, total;

    Result(int a, int att, int s, int end) {
        super(a, att, s);
        endSem = end;
    }

    public void calculateIA() {
        ia = assignment + attendance + sessional;
    }

    public void calculateTotal() {
        total = ia + endSem;
    }

    void display() {
        System.out.println("Assignment: " + assignment);
        System.out.println("Attendance: " + attendance);
        System.out.println("Sessional: " + sessional);
        System.out.println("Internal Assessment (IA): " + ia);
        System.out.println("End Semester: " + endSem);
        System.out.println("Total Marks: " + total);
    }
}

// Main class
public class MarksSystem {
    public static void main(String[] args) {
        Result r = new Result(8, 6, 18, 55);

        r.calculateIA();
        r.calculateTotal();
        r.display();
    }
}