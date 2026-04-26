//Write a Java AWT program that creates a Frame to display a bar representing a student’s marks. Assume the marks are stored in an integer variable (for example, int marks = 75; ). draw the x and y axes , and then draw a single filled rectangle (bar) whose height is proportional to the marks. And display the value of the marks above the bar. Assume required imports and that the class extends Frame.
import java.awt.*;

public class MarksBar extends Frame {

    int marks = 75; // Example marks

    public MarksBar() {
        setTitle("Student Marks Bar");
        setSize(400, 400);
        setVisible(true);
    }

    public void paint(Graphics g) {
        // Draw X and Y axes
        g.drawLine(50, 300, 300, 300); // X-axis
        g.drawLine(50, 300, 50, 50); // Y-axis

        // Scale factor (so bar fits nicely)
        int barHeight = marks * 2; // Adjust scaling if needed

        // Draw bar (filled rectangle)
        g.setColor(Color.BLUE);
        g.fillRect(100, 300 - barHeight, 50, barHeight);

        // Draw marks value above bar
        g.setColor(Color.BLACK);
        g.drawString("Marks: " + marks, 100, 300 - barHeight - 10);
    }

    public static void main(String[] args) {
        new MarksBar();
    }
}