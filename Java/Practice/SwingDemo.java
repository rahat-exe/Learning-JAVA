
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class SwingDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame("Swing Practice");
        f.setSize(400, 300);
        f.setLayout(new GridLayout(10,1));

        JLabel l1 = new JLabel("Enter name?");
        JTextField t1 = new JTextField();

        JTextArea t2 = new JTextArea();

        JCheckBox c1 = new JCheckBox("JAVA");
        JCheckBox c2 =  new JCheckBox("PYTHON");
        JPanel p1 = new JPanel();
        p1.add(c1);
        p1.add(c2);

        JCheckBox c3 = new JCheckBox("Male");
        JCheckBox c4 = new JCheckBox("Female");
        ButtonGroup g = new ButtonGroup();
        g.add(c3);
        g.add(c4);

        String lis[] = {"FGH","DFGH","FGHJ"};
        JComboBox cb = new JComboBox(lis);

        JList ls = new JList(lis);

        JLabel l4 = new JLabel("");
        JButton b = new JButton("Submit");
        b.addActionListener(e ->{
            l4.setText("Submited");
        }
            
        );

        f.add(l1);
        f.add(t1);
        f.add(t2);
        f.add(p1);
        f.add(c3);
        f.add(c4);
        f.add(cb);
        f.add(ls);
        f.add(l4);
        f.add(b);

        f.setVisible(true);
    }
}
