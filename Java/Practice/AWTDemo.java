import java.awt.*;
import java.awt.event.*;




public class AWTDemo {
    public static void main(String[] args) {
        Frame f = new Frame("Practice AWT");
        f.setSize(500,400);
        f.setLayout(new GridLayout(10,1));

        Label l1 = new Label("Enter name");
        TextField t1 = new TextField();
        // Panel p1 = new Panel();
        // p1.add(l1);
        // p1.add(t1);

        TextArea t2 = new TextArea();

        Checkbox c1 = new Checkbox("JAVA");
        Checkbox c2 = new Checkbox("PYTHON");
        Panel p2 = new Panel();
        p2.add(c1);
        p2.add(c2);

        CheckboxGroup g = new CheckboxGroup();
        Checkbox c3 = new Checkbox("Male",g,false);
        Checkbox c4 = new Checkbox("Female",g,false);

        Panel p3 = new Panel();
        p3.add(c3);
        p3.add(c4);

        Choice c = new Choice();
        c.add("1");
        c.add("2");
        c.add("2");
        c.add("2");

        List l = new List();
        l.add("1");
        l.add("2");
        l.add("2");
        l.add("2");

        Label l2 = new Label("");

        Button b1 = new Button("Submit");
        b1.addActionListener(e ->
            l2.setText("Submited")
        );

        Button b2 = new Button("Close");
        b2.addActionListener(e -> 
            System.exit(0)
        );

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                f.dispose();
            }
        });

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });




        // f.add(p1);
        f.add(l1);
        f.add(t1);
        f.add(t2);
        f.add(p2);
        f.add(p3);
        f.add(c);
        f.add(l);
        f.add(l2);
        f.add(b1);
        f.add(b2);
        f.setVisible(true);
    }
} 