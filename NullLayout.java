import java.awt.*;

class NullLayout
{
	public static void main(String args[])
	{
		Frame f=new Frame();
		f.setSize(600,400);
		f.setLayout(null);
		Button b=new Button("ok");
		b.setLocation(30,50);
		
		b.setSize(80,40);
		f.add(b);
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		f.setVisible(true);
	}
}