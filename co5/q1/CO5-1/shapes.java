import java.awt.*;
import java.applet.*;
public class shapes extends Applet
{
 public void paint(Graphics g)
{
g.setColor(Color.red);
g.drawLine(10,10,250, 10);
g.drawRect(220, 150, 200, 200);
g.drawOval(20,20,200,120);

   
}
}
/*
<applet code = "shapes.class" width = "420" height = "320" border="5"></applet>
*/