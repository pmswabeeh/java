import javax.swing.*;
import java.awt.*;
class LoginSwing extends JFrame
{
JTextField t1,t2;
JButton b1,b2;
public LoginSwing(String title)
{
super(title);
JLabel l1=new JLabel("username");
JLabel l2=new JLabel("password");
t1=new JTextField(10);
t2=new JTextField(10);
b1=new JButton("ok");
b2=new JButton("cancel");
setLayout(new FlowLayout());
add (l1);
add (t1);
add (l2);
add (t2);
add (b1);
add (b2);
}
public static void main(String arg[])
{
LoginSwing l = new LoginSwing("Login page");
l.setSize(200,200);
l.setVisible(true);
}
}