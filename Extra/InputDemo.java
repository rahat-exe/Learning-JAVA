import java.util.Scanner;

class InputDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // reading int
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        // reading double
        System.out.print("Enter a decimal number: ");
        double d = sc.nextDouble();

        // reading single word string
        System.out.print("Enter a single word: ");
        String word = sc.next();

        sc.nextLine(); // 🔴 IMPORTANT: clear buffero

        // reading full line string
        System.out.print("Enter a full sentence: ");
        String line = sc.nextLine();

        // printing values
        System.out.println("\n--- Output ---");
        System.out.println("Integer = " + num);
        System.out.println("Double = " + d);
        System.out.println("Word = " + word);
        System.out.println("Line = " + line);

        sc.close();
    }
}