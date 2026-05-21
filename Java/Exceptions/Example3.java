

public class Example3 {
  public static void main(String[] args) {
    try {
        int result = 12/0;
        // throw new Exception("Cannot divide by 0");  No need for this manual throw because dividing by 0 already cause an exception
    } catch (Exception e) {
        System.out.println(e);
        System.err.println(e.getMessage());
        System.err.println(e);
    } finally{
        System.out.println("Finally Block runs");
    }

    int age = 15;
    // if(age < 18){
    //     throw new ArithmeticException();
    // }
    if(age < 18){
        throw new ArithmeticException("Less then 18, unable to vote");
    }
    // try {
    //     if(age < 18){
    //         throw new Exception("Less then 18, unable to vote");
    //     }
    // } catch (Exception e) {
    //     System.out.println(e);
    //     System.out.println(e.getLocalizedMessage());

    // }

    // if(age < 18){
    //     throw new Exception("Less than 18");
    // }
    // if(age < 18){
    // throw new ArithmeticException("Less then 18, unable to vote");
    // }

    
  }  
}
