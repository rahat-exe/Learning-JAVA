// import java.awt.*;
import javax.swing.*;

public class Swing1 {
    public static void main(String args[]){

        JFrame frame = new JFrame("My first window");
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setLayout(new FlowLayout());
        frame.setLayout(null);
        
        JLabel label = new JLabel("Hello");
       

        JLabel label1 = new JLabel("");
        label1.setBounds(70, 70, 150, 30);
        
        JTextField field = new JTextField();
        field.setBounds(80, 10, 150, 30);
        
        JButton btn = new JButton("Click me");
        btn.setBounds(100, 100, 100, 50);
        
        btn.addActionListener(e ->  {
            String text = field.getText();
            label1.setText("Button Click "+"Hello "+text);

        });
        
        
        frame.add(label);
        frame.add(label1);
        frame.add(field);
        frame.add(btn);
        
        frame.setVisible(true);
    }
}
