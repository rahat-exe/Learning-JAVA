import java.util.Scanner;

public class Q7 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        String binary = "";
        while(num>0){
            binary = binary + num%2;
            num = num/2;
        }
        String result = new StringBuilder(binary).reverse().toString();
        System.out.println(result);
   } 
}
