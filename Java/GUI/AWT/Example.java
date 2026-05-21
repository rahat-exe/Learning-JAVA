import java.awt.*;
import java.awt.event.*;




public class Example {
    public static void main(String[] args) {
        Frame f = new Frame("Example AWT");
        f.setSize(400, 300);
        f.setLayout(new GridLayout(10,1));

        Label l1 = new Label("Enter your name?");
        TextField t1 = new TextField();
        Button b1 = new Button("Submit");

        Panel p1 = new Panel();


        Checkbox c1 = new Checkbox("Java");
        Checkbox c2 = new Checkbox("Python");

        p1.add(c1);
        p1.add(c2);

        CheckboxGroup c3 = new CheckboxGroup();
        Checkbox c4 = new Checkbox("Male",c3,false);
        Checkbox c5 = new Checkbox("Female",c3,false);

        Choice ch = new Choice();
        ch.add("Apple");
        ch.add("Mango");
        ch.add("Lichi");

        List list = new List(4, false); 
        list.add("Option 1");
        list.add("Option 2");
        list.add("Option 3");
        list.add("Option 4");
        
        
        f.add(l1);
        f.add(t1);
        f.add(b1);
        f.add(p1);
        // f.add(c1);
        // f.add(c2);
        f.add(c4);
        f.add(c5);
        f.add(ch);
        f.add(list);

        // f.addWindowListener(new WindowAdapter() {

        // public void windowClosing(WindowEvent e) {

        // System.exit(0);
        // }
        // });

        f.addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent e) {

                f.dispose();
            }
        });

        f.setVisible(true);
    }
}