import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class calculators extends Applet implements ActionListener
{
   Label l1,l2,l3;
   TextField t1,t2;
   Button b1,b2,b3,b4;

   public void init()
   {                     
     setLayout(new FlowLayout());

     l1=new Label("First Number:");
     t1=new TextField(20);
    
     l2=new Label("Second Number:");
     t2=new TextField(20);
    
     b1=new Button("Add");
     b2=new Button("Subt");
     b3=new Button("Mult");
     b4=new Button("Div");
     

     l3=new Label("Result");
    
     add(l1);
     add(l2);
     add(l3);
     add(t1);
     add(t2);
     add(b1);
     add(b2);
     add(b3);
     add(b4);
     
     

     b1.addActionListener(this);
     b2.addActionListener(this);
     b3.addActionListener(this);
     b4.addActionListener(this);
     
   }

   public void actionPerformed(ActionEvent ae)
   {
    Double num1=Double.parseDouble(t1.getText());
    Double num2=Double.parseDouble(t2.getText());
    if(ae.getSource()==b1)
     {
       Double value=num1+num2;
       l3.setText(""+value);
     }
    if(ae.getSource()==b2)
     {
       Double value=num1-num2;
       l3.setText(""+value);
     }
    if(ae.getSource()==b3)
     {
       Double value=num1*num2;
       l3.setText(""+value);
     }
    if(ae.getSource()==b4)
     {
       Double value=num1/num2;
       l3.setText(""+value);
     }
    
  }
}

/* <applet code = "calculators.class" width = "200" height = "400"></applet> */