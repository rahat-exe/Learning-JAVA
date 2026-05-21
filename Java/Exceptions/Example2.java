class AgeException extends Exception{
    public AgeException(String msg){
        super(msg);
    }
}

public class Example2 {
    public static void main(String[] args) {
        int age =12;
        try {
            if(age < 18){
                throw new AgeException("You are under Age");
            }else{
                System.err.println("You are eligible");
            }
        } catch (Exception e) {
            System.err.println(e);
            System.err.println(e.getMessage());
        }
        System.err.println("Program is still running");

    }
    
}
