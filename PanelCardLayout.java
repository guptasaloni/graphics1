import java.awt.*;
import java.awt.event.*;

class PanelCardLayout implements ActionListener
{
	Frame f;
	Panel p1,p2,p3,p4,p5,p6;
	Button b1,b2;
	CardLayout c1;
	GridLayout g1;
	
	public PanelCardLayout()
	{
		f=new Frame();
		f.setSize(400,300);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		
		p1=new Panel();
		p2=new Panel();
		
		c1=new CardLayout();
		p2.setLayout(c1);
		
		p3=new Panel();
		p4=new Panel();
		p5=new Panel();
		p6=new Panel();
		
		g1=new GridLayout(4,2);
		p3.setLayout(g1);
		p4.setLayout(g1);
		p5.setLayout(g1);
		p6.setLayout(g1);
		
		p3.add(new Label("Name:"));
		p3.add(new TextField());
		
		p3.add(new Label("surName:"));
		p3.add(new TextField());
		
		p3.add(new Label("age:"));
		p3.add(new TextField());
		
		p4.add(new Label("Houseno.:"));
		p4.add(new TextField());
		
		p4.add(new Label("street:"));
		p4.add(new TextField());
		
		p4.add(new Label("city:"));
		p4.add(new TextField());
		
		p4.add(new Label("state:"));
		p4.add(new TextField());
		
		p5.add(new Label("phoneno.:"));
		p5.add(new TextField());
		
		p5.add(new Label("mobile:"));
		p5.add(new TextField());
		
		p5.add(new Label("fax:"));
		p5.add(new TextField());
		
		p5.add(new Label("email:"));
		p5.add(new TextField());
		
		p6.add(new Label("salary.:"));
		p6.add(new TextField());
		
		p6.add(new Label("Hra:"));
		p6.add(new TextField());
		
		p6.add(new Label("TA:"));
		p6.add(new TextField());
		
		p6.add(new Label("DA:"));
		p6.add(new TextField());
		
		p2.add(p3); p2.add(p4); p2.add(p5); p2.add(p6);
		
		b1=new Button("NEXT");
		b1.addActionListener(this);
		b2=new Button("PREVIOUS");
		b2.addActionListener(this);
		p1.add(b1); p1.add(b2);
		
		f.add(p2);
		f.add(p1,BorderLayout.SOUTH);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
			c1.previous(p2);
		else
			c1.next(p2);
	}
	public static void main(String args[])
	{
		new PanelCardLayout();
	}
}