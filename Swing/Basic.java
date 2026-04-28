import javax.swing.*;
import java.awt.*;


public class Basic {
    public static void main(String args[]){
        JFrame  f = new JFrame("Basic SWING");
        f.setSize(400, 300);
        f.getContentPane().setBackground(Color.LIGHT_GRAY);
        f.setLayout(new GridLayout(10,1));

        JLabel l1 = new JLabel("Enter Name?");
        JTextField f1 = new JTextField(10);
        JButton b1 = new JButton("Submit");
        JLabel l2 = new JLabel("");

        b1.addActionListener(e -> {
            l2.setText("Hello "+ f1.getText());
        });

        f.add(l1);
        f.add(f1);
        f.add(b1);
        f.add(l2);

        f.setVisible(true);
    }
}
