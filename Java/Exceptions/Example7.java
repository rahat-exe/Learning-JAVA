public class Example7 {
    public static void main(String[] args) {
        // int result = 12 / 0;
        // System.out.println(result);  // Will cause exception and program will terminate
        try {
            int result = 12/0;
            System.out.println(result);
        } catch (Exception e) {
            System.err.println(e);
        }
        System.err.println("Program is still running");
    }
}
