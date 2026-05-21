

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello World");
        System.out.println(sb);

        sb.append(" My name is Rahat ");
        System.out.println(sb);

        sb.insert(11," world");
        System.out.println(sb);

        sb.delete(11, 17);
        System.out.println(sb);

        sb.replace(24,29, "Islam");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);
    }
}
