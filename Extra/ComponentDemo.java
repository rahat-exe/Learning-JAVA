import java.awt .*;
import java.awt.event .*;
import javax.swing .*;


class ComponentDemo extends JFrame implements ItemListener{
JRadioButton m,f;
JCheckBox c1,c2;
JToggleButton tb;
Container content;
JLabel lbl;
void componentDemo() {
setTitle ("Demo for Checkbox RadioButton & ToggleButton");

content = getContentPane();
setSize(300,150);

setDefaultCloseOperation(EXIT_ON_CLOSE);
setLayout(new FlowLayout());
c1 = new JCheckBox("Music");

c2 = new JCheckBox("Dancing");

c1.addItemListener(this);



c2.addItemListener(this);


add(c1);
add(c2);



m = new JRadioButton("Male");
f= new JRadioButton("Female");
ButtonGroup bg = new ButtonGroup();
bg.add(m);
bg.add(f);
m.addItemListener(this);
f.addItemListener(this);



add(m);



add(f);



tb= new JToggleButton("Change Color");



lbl = new JLabel();
add(lbl);



tb.addItemListener(this);


add(tb);

setVisible(true);

}

public void itemStateChanged(ItemEvent ae){



if(ae.getItem() == tb && ae.getStateChange() == ItemEvent.SELECTED)

content.setBackground(Color.blue);



if(ae.getItem() == tb && ae.getStateChange() == ItemEvent.DESELECTED)



content.setBackground(Color.red);



if(ae.getItem() == c1 && ae.getStateChange() == ItemEvent.SELECTED)



lbl.setText("Music");



if(ae.getItem() == c2 && ae.getStateChange() == ItemEvent.SELECTED)


lbl.setText("Dancing");



if(ae.getItem() == m && ae.getStateChange() == ItemEvent.SELECTED)



lbl.setText("Male");



if(ae.getItem() == f && ae.getStateChange() == ItemEvent.SELECTED);

lbl.setText("Female");
}

public static void main(String[] args) {
ComponentDemo demo = new ComponentDemo();
demo.componentDemo();
}}