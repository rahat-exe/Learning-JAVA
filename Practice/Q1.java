class MarkCard{
   String name;
   int roll_number;
   int fullMarks;

   MarkCard(String name, int roll_number, int fullMarks){
    this.name = name;
    this.roll_number = roll_number;
    this.fullMarks = fullMarks;
   }

   void display(){
    System.out.println("Name =" + name);
    System.out.println("Roll no =" + roll_number);
    System.out.println("Full Marks =" + fullMarks);

   }
}

public class Q1 {
    public static void main(String[] args) {
        MarkCard m1 = new MarkCard("Rahat Islam", 16, 99);
        m1.display();
    }
}
