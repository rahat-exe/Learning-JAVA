
 interface demo {
    void calculateIA();
    void calculateTotal();
}
class Student{
    int roll_number;
    int assignment;
    int attendence;
    int sessinal;
    Student(int roll_number, int assignment, int attendence, int sessinal){
        this.roll_number = roll_number;
        this.assignment = assignment;
        this.attendence = attendence;
        this.sessinal = sessinal;
    }
}

class Result extends Student implements demo{
    int endSemMarks;
    int ia;
    int total;
    Result(int roll_number, int assignment, int attendence, int sessinal, int endSemMarks){
     super(roll_number, assignment, attendence, sessinal);
     this.endSemMarks = endSemMarks;
    }
    public void calculateIA(){
        ia = sessinal + attendence + assignment;
    }
    public void calculateTotal(){
        total = ia + endSemMarks;
    }
    void display(){
        System.out.println("Roll Number: "+roll_number);
        System.out.println("Internal marks: "+ia);
        System.out.println("Total:"+total);


    }
} 

 class Q13 {
  public static void main(String[] args) {
    Result r1 = new Result(16, 10, 10, 10, 60);
    r1.calculateIA();
    r1.calculateTotal();
    r1.display();
  }  
}
