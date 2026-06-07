import java.util.Scanner;

public class Q5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String st = sc.nextLine();

        String rev = new StringBuilder(st).reverse().toString();
        String result = rev.substring(0,4) +"&" +rev.substring(4);
        System.out.println(result);
    }
}
