import javax.swing.*;
import java.awt.GridLayout;

public class Example {
    public static void main(String[] args) {
        JFrame f = new JFrame("Example Swing");
        f.setSize(400, 300);
        f.setLayout(new GridLayout(10, 1));

        JLabel l1 = new JLabel("Enter your name?");
        JTextField t1 = new JTextField();
        JButton b1 = new JButton("Submit");

        JCheckBox c1 = new JCheckBox("Java");
        JCheckBox c2 = new JCheckBox("Python");

        JPanel p1 = new JPanel();
        p1.add(c1);
        p1.add(c2);

        JRadioButton r1 = new JRadioButton("Male");
        JRadioButton r2 = new JRadioButton("Female");
        ButtonGroup g = new ButtonGroup();
        g.add(r1);
        g.add(r2);

        String data[] ={"apple","mango","lichi"};
        JComboBox cb = new JComboBox(data);

        // String items[] = { "Java", "Python", "C", "C++" };
        String[] items = { "Java", "Python", "C", "C++" };

        JList l = new JList(items);

        f.add(l1);
        f.add(t1);
        f.add(b1);
        // f.add(c1);
        // f.add(c2);
        f.add(p1);
        f.add(r1);
        f.add(r2);
        f.add(cb);
        f.add(l);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        f.setVisible(true);
    }
}