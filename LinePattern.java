import java.awt.*;
import java.awt.event.*;

class LinePattern extends MouseMotionAdapter
{
	Frame f;
	Graphics g;
	
	public LinePattern()
	{
		f=new Frame();
		f.setSize(400,400);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		
		g=f.getGraphics();
		f.addMouseMotionListener(this);
	}
	public void mouseMoved(MouseEvent e)
	{
		int x,y;
		x=e.getX();
		y=e.getY();
		
		Dimension d;
		d=f.getSize();
		int w,h;
		w=d.width;
		h=d.height;
		
		g.setColor(Color.red);
		g.drawLine(x,y,0,0);
		
		g.setColor(Color.green);
		g.drawLine(x,y,w,0);
		
		g.setColor(Color.yellow);
		g.drawLine(x,y,0,h);
		
		g.setColor(Color.blue);
		g.drawLine(x,y,w,h);
	}
	public static void main(String args[])
	{
		new LinePattern();
	}
}