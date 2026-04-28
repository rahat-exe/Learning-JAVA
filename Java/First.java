import java.util.*;

class DisplayInfo{
    String name;
    int age;
    DisplayInfo(String n, int a){
        name = n;
        age = a;
    }
    void Display(){
        System.out.println("Name: "+name+" age: "+age);
    }
}
public class First {
    // methods
    public static void Display(String n, int a){
        System.out.println("Name: " + n + " age: " + a);
    }

    public static int add(int x , int y){
        return x + y;
    }
    public static void main(String[] args) {
        System.out.println("Hello");
        // Common data types
        int age = 25;           // whole numbers
        double price = 9.99;    // decimal numbers
        boolean isHappy = true; // true or false
        char letter = 'A';      // single character
        String name = "John";   // text
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name");
        String name1 = sc.nextLine();

        System.out.println("Enter your age");
        int age1 = sc.nextInt();

        System.out.println("Name: "+name1+" age: "+age1);

        Display(name1, age1);

        int result = add(5, 6);
        System.out.println(result);

        DisplayInfo d = new DisplayInfo(name, age);
        d.Display();

        DisplayInfo d1 = new DisplayInfo("name", 44);
        d.Display();



    }
}


/*
 * String (whole line) nextLine() "Hello World"
 * String (one word) next() "Hello"
 * Integer nextInt() 25
 * Double nextDouble() 9.99
 * Float nextFloat() 9.99
 * Boolean nextBoolean() true
 * Long nextLong() 123456789
 * Char next().charAt(0) 'A'
 * 
 */