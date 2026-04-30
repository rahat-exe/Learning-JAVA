import java.awt.*;
import java.awt.event.*;

public class SimpleAWT {

    public static void main(String[] args) {

        Frame frame = new Frame("AWT Example");

        Label label = new Label("Click the button");
        Button button = new Button("Click Me");

        frame.setLayout(new FlowLayout());

        frame.add(label);
        frame.add(button);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Button Clicked!");
            }
        });

        frame.setSize(300,200);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}