import java.io.FileReader;
import java.io.FileWriter;

class FileWriterDemo {
    public static void main(String[] args) throws Exception {
        FileWriter f = new FileWriter("xyz.txt");
        String s = "Hello World";
        f.write("Hello World");
        f.write(s);
        f.close();
    }
}
