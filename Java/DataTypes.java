/*
    Java Program Demonstrating:
    1. Variables
    2. Constants
    3. All Primitive Data Types
*/

class DataTypes {

    public static void main(String args[]) {

        // ---------------- CONSTANT ----------------

        // final keyword makes the value constant (cannot be changed)
        // double size = 8 bytes
        final double PI = 3.14159;

        // ---------------- INTEGER TYPES ----------------

        // byte
        // Size: 1 byte
        // Range: -128 to 127
        byte smallNumber = 100;

        // short
        // Size: 2 bytes
        // Used for slightly larger integers
        short mediumNumber = 20000;

        // int
        // Size: 4 bytes
        // Most commonly used integer type
        int age = 21;

        // long
        // Size: 8 bytes
        // Used for very large integers
        // 'L' is added at the end
        long population = 9876543210L;

        // ---------------- DECIMAL TYPES ----------------

        // float
        // Size: 4 bytes
        // Stores decimal numbers
        // 'f' is required at the end
        float marks = 85.5f;

        // double
        // Size: 8 bytes
        // More precision than float
        double salary = 45678.9876;

        // ---------------- CHARACTER TYPE ----------------

        // char
        // Size: 2 bytes
        // Stores single character
        // Uses single quotes
        char grade = 'A';

        // ---------------- BOOLEAN TYPE ----------------

        // boolean
        // Size: JVM dependent (typically 1 bit logically)
        // Stores true or false
        boolean isPassed = true;

        // ---------------- NON-PRIMITIVE TYPE ----------------

        // String
        // Stores sequence of characters (text)
        String name = "Rahat";

        // ---------------- OUTPUT ----------------

        System.out.println("Constant PI = " + PI);

        System.out.println("byte value = " + smallNumber);
        System.out.println("short value = " + mediumNumber);
        System.out.println("int value = " + age);
        System.out.println("long value = " + population);

        System.out.println("float value = " + marks);
        System.out.println("double value = " + salary);

        System.out.println("char value = " + grade);

        System.out.println("boolean value = " + isPassed);

        System.out.println("String value = " + name);
    }
}