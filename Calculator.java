import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowListener;

class Calculator  implements ActionListener {
Frame f=new Frame();
Label l1=new Label("first no:");
Label l2=new Label("second no:");
Label l3=new Label("Result");
TextField t1=new TextField();
TextField t2=new TextField();
TextField t3=new TextField();
Button b1=new Button("Add");
Button b2=new Button("Subt");
Button b3=new Button("Mult");
Button b4=new Button("Div");
Button b5=new Button("Clr");
Calculator()

{
l1.setBounds(40,100,100,50);
l2.setBounds(40,140,150,50);
l3.setBounds(40,140,150,50);
t1.setBounds(200,140,150,50);
t2.setBounds(200,140,150,50);
t3.setBounds(200,140,150,50);
b1.setBounds(40,140,150,50);
b2.setBounds(40,140,150,50);
b3.setBounds(40,140,150,50);
b4.setBounds(40,140,150,50);
b5.setBounds(40,140,150,50);

f.add(l1);
f.add(l2);
f.add(l3);
f.add(t1);
f.add(t2);
f.add(t3);
f.add(b1);
f.add(b2);
f.add(b3);
f.add(b4);
f.add(b5);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
f.setLayout(null);
f.setVisible(true);
f.setSize(400,500);
}
public void actionPerformed(ActionEvent e) {
int n1=Integer.parseInt(t1.getText());

int n2=Integer.parseInt(t2.getText());
if(e.getSource()==b1) {
t3.setText(String.valueOf(n1+n2));
}
if(e.getSource()==b2) {
t3.setText(String.valueOf(n1-n2));
}
if(e.getSource()==b3) {
t3.setText(String.valueOf(n1*n2));
}
if(e.getSource()==b4) {
t3.setText(String.valueOf(n1/n2));
}
if(e.getSource()==b5) {
System.exit(0);
}
}
public static void main(String args[]) {
Calculator cal=new Calculator();
cal.addWindowListener(new WindowAdapter() 
{
public void windowClosing(WindowEvent e)
{
System.exit(0);
 }
} );

} 

}
/*
<applet code = "Calculator.class" width = "420" height = "320" border="5"></applet>
*/











