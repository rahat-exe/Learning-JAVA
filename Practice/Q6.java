import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String st = sc.nextLine();
        String rev = "";

        for(int i = st.length()-1; i>=0; i--){
            rev = rev + st.charAt(i);
        }

        if(st.equals(rev)){
            System.out.println("Palindrome");

        }else{
            System.out.println("Not a Palindrome");

        }

    }
}
