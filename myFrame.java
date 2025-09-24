import java.awt.Frame;
class myFrame extends Frame
{
	myFrame(String t)
	{
		super(t);
	}
	public static void main(String arg[])
	{
		myFrame f=new myFrame("My 1st frame");
		f.setSize(400,300);
		f.setVisible(true);
	}
}