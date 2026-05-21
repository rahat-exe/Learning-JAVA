class Department {
    String departmentName;

    Department(String departmentName) {
        this.departmentName = departmentName;
    }
}

class Teacher extends Department {
    String teacherName;

    Teacher(String departmentName, String teacherName) {
        super(departmentName);
        this.teacherName = teacherName;
    }
}
class Students extends Teacher {
    String studentName;
    Students(String departmentName, String teacherName,String Name) {
        super(departmentName, teacherName);
        studentName = Name;
    }
}

public class Multilevel {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("MCA", "Rahat");
        System.out.println(t1.departmentName);
        System.out.println(t1.teacherName);

        Students s1 = new Students("MCA", "Daisy Maam", "Rahat");
        System.out.println(s1.departmentName);
        System.out.println(s1.teacherName);
        System.out.println(s1.studentName);
    }
}
