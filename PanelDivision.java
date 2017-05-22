import java.awt.*;
import java.awt.event.*;

class PanelDivision
{
	public static void main(String args[])
	{
		Frame f=new Frame();
		f.setLayout(new GridLayout(2,2));
		f.setSize(400,300);
		
		Panel p1=new Panel();
		Panel p2=new Panel();
		Panel p3=new Panel();
		Panel p4=new Panel();
		
		p1.setLayout(new GridLayout(2,1));
		Button b1=new Button("1");
		Button b2=new Button("2");
		p1.add(b1); p1.add(b2);
		f.add(p1);
		
		p2.setLayout(new GridLayout(1,3));
		Button b3=new Button("3");
		Button b4=new Button("4");
		Button b5=new Button("5");
		p2.add(b3); p2.add(b4); p2.add(b5);
		f.add(p2);
		
		p3.setLayout(new GridLayout(1,2));
		Panel p31=new Panel();
		p31.setLayout(new GridLayout(2,1));
		Button b6=new Button("6");
		Button b7=new Button("7");
		p31.add(b6); p31.add(b7);
		p3.add(p31);
		
		Panel p32=new Panel();
		p32.setLayout(new GridLayout(3,1));
		Button b8=new Button("8");
		Button b9=new Button("9");
		Button b10=new Button("10");
		p32.add(b8); p32.add(b9); p32.add(b10);
		p3.add(p32);
		f.add(p3);
		
		p4.setLayout(new GridLayout(2,1));
		Panel p41=new Panel();
		p41.setLayout(new GridLayout(1,2));
		Button b11=new Button("11");
		Button b12=new Button("12");
		p41.add(b11); p41.add(b12);
		p4.add(p41);
		
		//p4.setLayout(new GridLayout(2,1));
		Panel p42=new Panel();
		p42.setLayout(new GridLayout(1,3));
		Button b13=new Button("13");
		Button b14=new Button("14");
		Button b15=new Button("15");
		p42.add(b13); p42.add(b14); p42.add(b15);
		p4.add(p42);
		f.add(p4);
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