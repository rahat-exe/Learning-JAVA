import mypackage.Add;

public class Example {
    public static void main(String[] args) {
        Add a = new Add();
        int sum = a.add(2, 5);
        System.out.println(sum);
        int minus = a.minus(10, 5);
        System.out.println(minus);
    }
}
